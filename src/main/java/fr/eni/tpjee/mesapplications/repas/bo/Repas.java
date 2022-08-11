package fr.eni.tpjee.mesapplications.repas.bo;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Repas {

    private int id_repas;
    private Time heure_repas;
    private Date date_repas;
    private List<Aliments> aliments = new ArrayList<>();

    public Repas() {
    }

    public Repas(Time heure_repas, Date date_repas) {
        this.heure_repas = heure_repas;
        this.date_repas = date_repas;
    }

    public Repas(int id_repas, Time heure_repas, Date date_repas) {
        this.id_repas = id_repas;
        this.heure_repas = heure_repas;
        this.date_repas = date_repas;
    }

    //GETTER SETTER

    public int getId_repas() {
        return id_repas;
    }

    public void setId_repas(int id_repas) {
        this.id_repas = id_repas;
    }


    public String getDate_repas() {
        return date_repas;
    }

    public void setDate_repas(Date date_repas) {
        this.date_repas = date_repas;
    }

    public Time getHeure_repas() {
        return heure_repas;
    }

    public void setHeure_repas(Time heure_repas) {
        this.heure_repas = heure_repas;
    }


    //Methode d'ajout d'un aliment a un repas.

    public List<Aliments> getAliments(){
        return aliments;
    }

    public void addAliments(Aliments aliment){
        this.aliments.add(aliment);
    }


}
