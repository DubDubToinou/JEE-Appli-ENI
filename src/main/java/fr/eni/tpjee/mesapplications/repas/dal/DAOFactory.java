package fr.eni.tpjee.mesapplications.repas.dal;

import fr.eni.tpjee.mesapplications.repas.dal.jdbc.RepasDAOJdbcImpl;

public class DAOFactory {

    public static DAORepas getRepasDAO(){

            return new RepasDAOJdbcImpl();

    }

}
