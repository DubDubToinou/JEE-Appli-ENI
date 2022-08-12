package fr.eni.tpjee.mesapplications.repas.bll;

import fr.eni.tpjee.mesapplications.repas.bo.Repas;
import fr.eni.tpjee.mesapplications.repas.dal.DAOFactory;
import fr.eni.tpjee.mesapplications.repas.dal.DAORepas;

import java.sql.SQLException;
import java.util.List;

public class SuiviRepasManager {

    private final DAORepas daoRepas;

    public SuiviRepasManager() {
        daoRepas = DAOFactory.getRepasDAO();
    }

    public List<Repas> getAllRepas(){
        List<Repas> listeRepas;

            listeRepas = daoRepas.selectAll();

        return listeRepas;
    }

    public Repas addRepas(Repas elementRepas) throws SQLException{

        if(elementRepas.getId_repas() != null){
            System.out.println("Element déjà dans la base");
        }else {
            validerRepas(elementRepas);
            daoRepas.insert(elementRepas);
        }
        return elementRepas;
    }

    public void validerRepas(Repas elementRepas){

       boolean valide = true;
       StringBuilder sb = new StringBuilder();

       if (elementRepas == null){
           sb.append("Aucun champs saisie");
           valide = false;
       }

       if(elementRepas.getDate_repas() == null){
           sb.append("Date manquante");
           valide = false;
       }

       if (elementRepas.getHeure_repas() == null){
           sb.append("Heure Manquante");
           valide = false;
       }

       if(elementRepas.getAliments() == null){
           sb.append("merci de saisir au moins 1 aliments");
           valide = false;
       }

       if(!valide){
           throw new RuntimeException(sb.toString());
       }


    }


}
