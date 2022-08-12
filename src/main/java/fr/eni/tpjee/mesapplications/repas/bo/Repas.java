package fr.eni.tpjee.mesapplications.repas.bo;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Repas {

    private Integer id_repas;
    private LocalTime heure_repas;
    private LocalDate date_repas;
    private List<Aliments> aliments = new ArrayList<>();

    public Repas(Integer id_repas, LocalTime heure_repas, LocalDate date_repas, List<Aliments> aliments) {
        this.id_repas = id_repas;
        this.heure_repas = heure_repas;
        this.date_repas = date_repas;
        this.aliments = aliments;
    }

    public Repas(Integer id_repas, LocalTime heure_repas, LocalDate date_repas) {
        this.id_repas = id_repas;
        this.heure_repas = heure_repas;
        this.date_repas = date_repas;
    }

    public Repas(LocalTime heure_repas, LocalDate date_repas) {
        this.heure_repas = heure_repas;
        this.date_repas = date_repas;
    }

    public Repas(LocalTime heure_repas, LocalDate date_repas, List<Aliments> aliments) {
        this.heure_repas = heure_repas;
        this.date_repas = date_repas;
        this.aliments = aliments;
    }

    //GETTER SETTER


    public Integer getId_repas() {
        return id_repas;
    }

    public void setId_repas(Integer id_repas) {
        this.id_repas = id_repas;
    }

    public LocalTime getHeure_repas() {
        return heure_repas;
    }

    public void setHeure_repas(LocalTime heure_repas) {
        this.heure_repas = heure_repas;
    }

    public LocalDate getDate_repas() {
        return date_repas;
    }

    public void setDate_repas(LocalDate date_repas) {
        this.date_repas = date_repas;
    }

    public List<Aliments> getAliments() {
        return aliments;
    }

    public void setAliments(List<Aliments> aliments) {
        this.aliments = aliments;
    }

    //########### methode Ajout ###############

    public void addAliment(Aliments elementAliment)
    {
        this.aliments.add(elementAliment);
    }

    @Override
    public String toString() {
        return "Repas{" +
                "id_repas=" + id_repas +
                ", heure_repas=" + heure_repas +
                ", date_repas=" + date_repas +
                ", aliments=" + aliments +
                '}';
    }
}
