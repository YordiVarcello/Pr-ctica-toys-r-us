package objectes.SWPROTema4;

import java.util.ArrayList;

public class CicleArrayList {
    String nom;
    int numAlumnes;
    ArrayList<Modul> al;
    int maximModuls;

    public CicleArrayList(String nom, int numAlumnes, int maximModuls) {
        this.nom = nom;
        this.numAlumnes = numAlumnes;
        al = new ArrayList<>();
        this.maximModuls = maximModuls;
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
    public boolean afegirModul(Modul m){
        if(al.size() == maximModuls){
            return false;
        }
        al.add(m);
return true;
    }
    public Modul tornaModul(String nom){
        for (Modul modul : al) {
            if (modul.nom.equals(nom)) {
                return modul;
            }
        }
        return null;
    }
    public boolean borrarModul(String nom){
        for(Modul modul: al){
            if(modul.nom.equals(nom)){
                al.remove(modul);
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Cicle{" +
                "nom='" + nom + '\'' +
                ", numAlumnes=" + numAlumnes +
                '}';
    }
}
