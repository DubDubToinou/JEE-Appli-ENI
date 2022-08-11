package fr.eni.tpjee.mesapplications.repas.bll;

import fr.eni.tpjee.mesapplications.repas.bo.Aliments;
import fr.eni.tpjee.mesapplications.repas.bo.Repas;
import fr.eni.tpjee.mesapplications.repas.dal.DAO;
import fr.eni.tpjee.mesapplications.repas.dal.DAOFactory;

public class RepasManager {

    private DAO<Repas> daoRepas = DAOFactory.getRepasDAO();
    private DAO<Aliments> daoAliments = DAOFactory.getAlimentsDAO();



}
