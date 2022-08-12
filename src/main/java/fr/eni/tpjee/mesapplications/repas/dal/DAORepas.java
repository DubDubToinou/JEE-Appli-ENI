package fr.eni.tpjee.mesapplications.repas.dal;

import fr.eni.tpjee.mesapplications.repas.bo.Repas;

import java.util.List;

public interface DAORepas  {

     void insert(Repas elementRepas);

     List<Repas> selectAll();
}
