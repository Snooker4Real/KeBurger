package io.github.juneau001.burgers.business;

public class Accompagnement {

    private String nom;
    private float sup;

    public Accompagnement() {
    }

    public Accompagnement(String nom, float sup) {
        this.nom = nom;
        this.sup = sup;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getSup() {
        return sup;
    }

    public void setSup(float sup) {
        this.sup = sup;
    }

    @Override
    public String toString() {
        return "Accompagnement{" +
                "nom='" + nom + '\'' +
                ", sup=" + sup +
                '}';
    }
}
