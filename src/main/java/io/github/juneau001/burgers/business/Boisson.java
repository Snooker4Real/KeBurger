package io.github.juneau001.burgers.business;

public class Boisson {
    private static Long sID = 0L;
    private Long id;
    private String nom;
    private float prix;

    public Boisson() {
        id = ++sID;
    }

    public Boisson(String nom, float prix) {
        this();
        this.nom = nom;
        this.prix = prix;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Boisson [nom=" + nom + ", prix=" + prix + "]";
    }
}
