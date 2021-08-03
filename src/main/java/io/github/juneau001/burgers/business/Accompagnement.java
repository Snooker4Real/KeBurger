package io.github.juneau001.burgers.business;

public class Accompagnement {

    private Long id;
    private String nom;
    private float sup;
    private static long inc = 0L;

    public Accompagnement() {
        id = inc++;
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
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", sup=" + sup +
                '}';
    }
}
