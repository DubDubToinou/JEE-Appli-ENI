package fr.eni.tpjee.mesapplications.repas.dal.jdbc;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionProvider {

    private static javax.sql.DataSource dataSource;

    static {

        try {
            dataSource = InitialContext.doLookup("java:com/env/jdbc/pool_cnx");

        } catch (NamingException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
