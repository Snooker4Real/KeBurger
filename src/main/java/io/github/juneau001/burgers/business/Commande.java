package io.github.juneau001.burgers.business;

public class Commande {

    private Long id;
    private static Long inc = 0L;
    private boolean surPlace;
    private Burger burger;
    private Boisson boisson;
    private Accompagnement accompagnement;
    private Sauce sauce;
    private String remarque;
    private String cbNumber;
    private String mois;
    private String annees;
    private String cryptogramme;

    public Commande() {
        id= ++inc;
    }

    public Commande(boolean surPlace, Burger burger, Boisson boisson, Accompagnement accompagnement, Sauce sauce, String remarque, String cbNumber, String mois, String annees, String cryptogramme) {
        this.surPlace = surPlace;
        this.burger = burger;
        this.boisson = boisson;
        this.accompagnement = accompagnement;
        this.sauce = sauce;
        this.remarque = remarque;
        this.cbNumber = cbNumber;
        this.mois = mois;
        this.annees = annees;
        this.cryptogramme = cryptogramme;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public Boisson getBoisson() {
        return boisson;
    }

    public void setBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    public Accompagnement getAccompagnement() {
        return accompagnement;
    }

    public void setAccompagnement(Accompagnement accompagnement) {
        this.accompagnement = accompagnement;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public boolean isSurPlace() {
        return surPlace;
    }

    public void setSurPlace(boolean surPlace) {
        this.surPlace = surPlace;
    }

    public String getCbNumber() {
        return cbNumber;
    }

    public void setCbNumber(String cbNumber) {
        this.cbNumber = cbNumber;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public String getAnnees() {
        return annees;
    }

    public void setAnnees(String annees) {
        this.annees = annees;
    }

    public String getCryptogramme() {
        return cryptogramme;
    }

    public void setCryptogramme(String cryptogramme) {
        this.cryptogramme = cryptogramme;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "surPlace=" + surPlace +
                ", burger=" + burger +
                ", boisson=" + boisson +
                ", accompagnement=" + accompagnement +
                ", sauce=" + sauce +
                ", remarque='" + remarque + '\'' +
                ", cbNumber='" + cbNumber + '\'' +
                ", mois='" + mois + '\'' +
                ", annees='" + annees + '\'' +
                ", cryptogramme='" + cryptogramme + '\'' +
                '}';
    }
}
