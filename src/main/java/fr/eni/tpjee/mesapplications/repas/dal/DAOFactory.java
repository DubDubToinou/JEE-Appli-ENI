package fr.eni.tpjee.mesapplications.repas.dal;

import fr.eni.tpjee.mesapplications.repas.bo.Aliments;
import fr.eni.tpjee.mesapplications.repas.bo.Repas;
import fr.eni.tpjee.mesapplications.repas.dal.jdbc.AlimentsDAOJdbcImpl;
import fr.eni.tpjee.mesapplications.repas.dal.jdbc.RepasDAOJdbcImpl;

public class DAOFactory {

    public static DAO<Repas> getRepasDAO(){

        return new RepasDAOJdbcImpl();
    }

    public static DAO<Aliments> getAlimentsDAO(){

        return new AlimentsDAOJdbcImpl();
    }
}
