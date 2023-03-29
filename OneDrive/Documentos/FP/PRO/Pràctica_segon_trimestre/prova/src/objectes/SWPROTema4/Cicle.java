package objectes.SWPROTema4;

public class Cicle {
    String nom;
    int numAlumnes;

    public Cicle(String nom, int numAlumnes) {
        this.nom = nom;
        this.numAlumnes = numAlumnes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumAlumnes() {
        return numAlumnes;
    }

    public void setNumAlumnes(int numAlumnes) {
        this.numAlumnes = numAlumnes;
    }

    @Override
    public String toString() {
        return "Cicle{" +
                "nom='" + nom + '\'' +
                ", numAlumnes=" + numAlumnes +
                '}';
    }
}
