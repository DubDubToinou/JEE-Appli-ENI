package fr.eni.tpjee.mesapplications.repas.dal.jdbc;

import fr.eni.tpjee.mesapplications.repas.bo.Aliments;
import fr.eni.tpjee.mesapplications.repas.bo.Repas;
import fr.eni.tpjee.mesapplications.repas.dal.DAORepas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepasDAOJdbcImpl implements DAORepas {

    public void insert(Repas elementRepas) {
        try(
                Connection con = ConnectionProvider.getConnection()
        ) {



            PreparedStatement stmt = con.prepareStatement("INSERT INTO Repas(date_repas,heure_repas) VALUES (?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            PreparedStatement stmt2 = con.prepareStatement("INSERT INTO Aliments (nom_aliment,id_repas) VALUES (?,?)");

            stmt.setDate(1, Date.valueOf(elementRepas.getDate_repas()));
            stmt.setTime(2, Time.valueOf(elementRepas.getHeure_repas()));

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();

            List<Aliments> aliments;

            if(rs.next()){
                elementRepas.setId_repas((rs.getInt(1)));
                aliments = elementRepas.getAliments();

                for (Aliments elementAliment : aliments){
                    stmt2.setString(1, elementAliment.getNom_aliment());
                    stmt2.setInt(2, elementRepas.getId_repas());
                    elementAliment.setId_repas(elementRepas.getId_repas());
                    stmt2.executeUpdate();
                }
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public List<Repas> selectAll(){
        List<Repas> listeDesRepas = new ArrayList<>();
        Statement stmt;
        Statement stmt2;

        try(Connection con = ConnectionProvider.getConnection()){

            stmt = con.createStatement();
            stmt2 = con.createStatement();

            ResultSet  rsRepas = stmt.executeQuery("SELECT id_repas,date_repas,heure_repas FROM Repas");

            while(rsRepas.next()){
                Repas repas = new Repas(rsRepas.getInt("id_repas"), rsRepas.getTime("heure_repas").toLocalTime(),
                        rsRepas.getDate("date_repas").toLocalDate());

                listeDesRepas.add(repas);

                ResultSet rsAliments = stmt2.executeQuery("SELECT nom_aliment,id_repas FROM Aliments WHERE = " + repas.getId_repas());

                while(rsAliments.next()){
                    Aliments aliment = new Aliments(rsAliments.getString("nom_aliment"), rsAliments.getInt("id_repas"));
                    repas.addAliment(aliment);
                }
            }

        }catch (SQLException ex){
            ex.printStackTrace();

        }

        return listeDesRepas;

    }


}
