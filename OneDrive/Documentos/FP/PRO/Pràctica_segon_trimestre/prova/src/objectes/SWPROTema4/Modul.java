package objectes.SWPROTema4;

public class Modul {
    int horesSetmanals;
    String nom;

    public Modul(int horesSetmanals, String nom) {
        this.horesSetmanals = horesSetmanals;
        this.nom = nom;
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
        return "Modul{" +
                "horesSetmanals=" + horesSetmanals +
                ", nom='" + nom + '\'' +
                '}';
    }

    public boolean equals(Modul modul) {
        if (horesSetmanals == modul.getHoresSetmanals() && nom.equals(modul.getNom())) {
            return true;
        }
        return false;
    }
}
