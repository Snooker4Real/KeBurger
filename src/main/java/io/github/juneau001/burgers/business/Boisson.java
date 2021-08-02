package io.github.juneau001.burgers.business;

public class Boisson {

    private String nom;

    public Boisson() {
    }

    public Boisson(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Boisson{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
