package fr.eni.tpjee.mesapplications.repas.dal.jdbc;

import fr.eni.tpjee.mesapplications.repas.bo.Aliments;
import fr.eni.tpjee.mesapplications.repas.dal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AlimentsDAOJdbcImpl implements DAO<Aliments> {


    @Override
    public void insert(Aliments elementAliments) throws SQLException {

        String sqlInsert = "INSERT INTO Aliments (id_aliment,nom_aliment) VALUES (?,?)";

        try(
                Connection con = ConnectionProvider.getConnection();
                ){

            PreparedStatement stmt = con.prepareStatement(sqlInsert);

            stmt.setInt(1, elementAliments.getId_aliment());
            stmt.setString(2, elementAliments.getNom_aliment());

            stmt.executeUpdate();

        }catch (SQLException ex){
            ex.printStackTrace();
        }


    }

    @Override
    public List<Aliments> selectAll() {
        return null;
    }
}
