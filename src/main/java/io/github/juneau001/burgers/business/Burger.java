package io.github.juneau001.burgers.business;

/*
* Cette classe représente le concept de burger
*
* Tout ce que notre client connait se trouve dans le package business
* @author Snooker4Real
* */

public class Burger {

    private Long id;
    private String nom;
    private float prix;
    private static Long compteur = 0L;

    public Burger() {
        id = compteur++;
    }

    public Burger(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Burger{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }


}
