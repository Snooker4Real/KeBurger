package io.github.juneau001.burgers.business;

public class Sauce {
    private String nom;

    public Sauce() {
    }
    public Sauce(String nom) {
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
        return "Sauce{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
