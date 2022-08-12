package fr.eni.tpjee.mesapplications.repas.bo;

public class Aliments {

    private String nom_aliment;
    private Integer id_repas;


    public Aliments() {
    }

    public Aliments(String nom_aliment, Integer id_repas) {
        this.nom_aliment = nom_aliment;
        this.id_repas = id_repas;
    }

    public Aliments(String nom_aliment) {
        this.nom_aliment = nom_aliment;
    }

    public String getNom_aliment() {
        return nom_aliment;
    }

    public void setNom_aliment(String nom_aliment) {
        this.nom_aliment = nom_aliment;
    }

    public Integer getId_repas() {
        return id_repas;
    }

    public void setId_repas(Integer id_repas) {
        this.id_repas = id_repas;
    }

    @Override
    public String toString() {
        return "Aliments{" +
                ", nom_aliment='" + nom_aliment + '\'' +
                ", id_repas=" + id_repas +
                '}';
    }
}