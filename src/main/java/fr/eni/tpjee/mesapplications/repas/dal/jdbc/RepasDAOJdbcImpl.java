package fr.eni.tpjee.mesapplications.repas.dal.jdbc;

import fr.eni.tpjee.mesapplications.repas.bo.Aliments;
import fr.eni.tpjee.mesapplications.repas.bo.Repas;
import fr.eni.tpjee.mesapplications.repas.dal.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepasDAOJdbcImpl implements DAO<Repas> {


    @Override
    public void insert(Repas elementRepas) throws SQLException{
        try(
                Connection con = ConnectionProvider.getConnection();
        ) {

            PreparedStatement stmt = con.prepareStatement("INSERT INTO Repas(id_repas,date_repas,heure_repas) VALUES (?,?,?,?)");

            stmt.setInt(1, elementRepas.getId_repas());
            stmt.setDate(2, Date.valueOf(elementRepas.getDate_repas()));
            stmt.setTime(3, Time.valueOf(elementRepas.getDate_repas()));

            stmt.executeUpdate();

        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public List<Repas> selectAll() {
        List<Repas> listeDesRepas = new ArrayList<Repas>();

        Repas elementRepas = null;
        Aliments aliment = null;
        Statement stmt;
        Statement stmt2;

        String sqlSelect = ("SELECT id_repas FROM Repas");
        String sqlSelectAliments = ("SELECT id_aliment,nom_aliment,id_repas FROM Aliments WHERE id_repas = ");

        try(
                Connection con = ConnectionProvider.getConnection();
                ){


            stmt = con.createStatement();
            stmt2 = con.createStatement();

            ResultSet rs  = stmt.executeQuery(sqlSelect);

            while (rs.next()) {
                elementRepas = new Repas(rs.getInt("id_repas"), rs.getTime("date_repas"), rs.getTime("heure_repas"));

                listeDesRepas.add(elementRepas);

                ResultSet rsAliments = stmt2.executeQuery(sqlSelectAliments + elementRepas.getId_repas());

                while (rsAliments.next()) {
                    aliment = new Aliments(rsAliments.getInt("idAliments"), rsAliments.getString("nom"),
                            rsAliments.getInt("idPizza"));
                    elementRepas.addAliments(aliment);
                }

            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }

        return listeDesRepas;
    }
}
