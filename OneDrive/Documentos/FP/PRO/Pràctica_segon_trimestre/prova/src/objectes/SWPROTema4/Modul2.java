package objectes.SWPROTema4;

public class Modul2 {
    int horesSetmanals;
    String nom;
    Cicle cicle;

    public Modul2(int horesSetmanals, String nom, Cicle cicle) {
        this.horesSetmanals = horesSetmanals;
        this.nom = nom;
        this.cicle = cicle;
    }

    public Cicle getCicle() {
        return cicle;
    }

    public void setCicle(Cicle cicle) {
        this.cicle = cicle;
    }

    public int getHoresSetmanals() {
        return horesSetmanals;
    }

    public void setHoresSetmanals(int horesSetmanals) {
        this.horesSetmanals = horesSetmanals;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Modul2{" +
                "horesSetmanals=" + horesSetmanals +
                ", nom='" + nom + '\'' +
                ", cicle=" + cicle +
                '}';
    }
}
