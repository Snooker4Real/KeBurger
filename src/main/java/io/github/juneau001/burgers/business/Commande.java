package io.github.juneau001.burgers.business;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private static Long sID = 0L;
    private Long id;

    private boolean surPlace;
    private Burger burger;
    private Accompagnement accompagnement;
    private Boisson boisson;
    private String remarques;
    private float prix;

    private List<Sauce> sauces = new ArrayList<>();
    private String noCarte;
    private String expiration;
    private String codeCVV;

    public Commande() {
        id = ++sID;
    }

    public Commande(Long id, Burger burger, Accompagnement accompagnement, Boisson boisson, String remarques,
                    List<Sauce> sauces) {
        this();
        this.id = id;
        this.burger = burger;
        this.accompagnement = accompagnement;
        this.boisson = boisson;
        this.remarques = remarques;
        this.sauces = sauces;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public boolean isSurPlace() {
        return surPlace;
    }

    public void setSurPlace(boolean surPlace) {
        this.surPlace = surPlace;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public Accompagnement getAccompagnement() {
        return accompagnement;
    }

    public void setAccompagnement(Accompagnement accompagnement) {
        this.accompagnement = accompagnement;
    }

    public Boisson getBoisson() {
        return boisson;
    }

    public void setBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    public List<Sauce> getSauces() {
        return sauces;
    }

    public void setSauces(List<Sauce> sauces) {
        this.sauces = sauces;
    }



    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getNoCarte() {
        return noCarte;
    }

    public void setNoCarte(String noCarte) {
        this.noCarte = noCarte;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getCodeCVV() {
        return codeCVV;
    }

    public void setCodeCVV(String codeCVV) {
        this.codeCVV = codeCVV;
    }

    @Override
    public String toString() {
        return "Commande [id=" + id + ", surPlace=" + surPlace + ", burger=" + burger + ", accompagnement="
                + accompagnement + ", boisson=" + boisson + ", remarques=" + remarques + ", prix=" + prix + ", sauces="
                + sauces + ", noCarte=" + noCarte + ", expiration=" + expiration + ", codeCVV=" + codeCVV + "]";
    }
}
