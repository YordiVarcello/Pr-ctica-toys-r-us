package objectes;

public class Producte {
    private String nom;
    private double preu;

    public Producte(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }
    public double getPreu() {
        return preu;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "{" +
                nom +
                "," + preu +
                '}';
    }
}
