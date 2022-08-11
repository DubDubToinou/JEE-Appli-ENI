package fr.eni.tpjee.mesapplications.repas.bo;

public class Aliments {

    private int id_aliment;
    private String nom_aliment;
    private int id_repas;

    /**
     * Constructeur vide
     */
    public Aliments() {
    }

    /**
     * Constructeur avec tous les attributs
     * @param id_aliment
     * @param nom_aliment
     * @param id_repas
     */
    public Aliments(int id_aliment, String nom_aliment, int id_repas) {
        this.id_aliment = id_aliment;
        this.nom_aliment = nom_aliment;
        this.id_repas = id_repas;
    }

    /**
     * Constructeur sans l'attribut id_Aliment
     * @param nom_aliment
     * @param id_repas
     */
    public Aliments(String nom_aliment, int id_repas) {
        this.nom_aliment = nom_aliment;
        this.id_repas = id_repas;
    }

    //getter et Setter


    public int getId_aliment() {
        return this.id_aliment;
    }

    public void setId_aliment(int id_aliment) {
        this.id_aliment = id_aliment;
    }

    public String getNom_aliment() {
        return this.nom_aliment;
    }

    public void setNom_aliment(String nom_aliment) {
        this.nom_aliment = nom_aliment;
    }

    public int getId_repas() {
        return this.id_repas;
    }

    public void setId_repas(int id_repas) {
        this.id_repas = id_repas;
    }

    @Override
    public String toString() {
        return "Aliments{" +
                "id_aliment=" + id_aliment +
                ", nom_aliment='" + nom_aliment + '\'' +
                ", id_repas=" + id_repas +
                '}';
    }
}
