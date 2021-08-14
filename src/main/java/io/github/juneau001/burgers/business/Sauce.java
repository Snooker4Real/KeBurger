package io.github.juneau001.burgers.business;
public class Sauce {
    private static Long sID = 0L;
    private Long id;
    private String nom;

    public Sauce() {
        id  = ++sID;
    }

    public Sauce(String nom) {
        this();
        this.nom = nom;
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

    @Override
    public String toString() {
        return "Sauce [nom=" + nom + "]";
    }



}
