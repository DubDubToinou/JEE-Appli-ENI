package fr.eni.tpjee.mesapplications.repas.dal;


import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {

    public void insert(T element) throws SQLException;

    public List<T> selectAll() throws SQLException;

}
