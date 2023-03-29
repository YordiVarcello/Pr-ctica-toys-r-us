package objectes.SWPROTema4;

import java.util.Arrays;

public class CicleArray {
    private String nom;
    private int numAlumnes;
    private Modul[] moduls;
    private int numModuls;

    public CicleArray(String nom, int numAlumnes, int moduls) {
        this.nom = nom;
        this.numAlumnes = numAlumnes;
        this.moduls = new Modul[moduls];
    }

    public int getNumModuls() {
        return numModuls;
    }

    public Modul[] getModuls() {
        if (numModuls == moduls.length) {
            return moduls;
        }
        Modul[] aux = new Modul[numModuls];
        for (int i = 0; moduls[i] != null; i++) {
            aux[i] = moduls[i];
        }
        return aux;
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

    public boolean afegirModul(Modul modul) {
        if (numModuls == moduls.length) {
            Modul[] aux = new Modul[moduls.length + 1];
            for (int i = 0; i < moduls.length; i++) {
                aux[i] = moduls[i];
            }
            moduls = aux;
        }
        moduls[numModuls] = modul;
        numModuls++;
        return false;
    }

    public Modul tornarModul(String nomModul) {
        for (int i = 0; i < moduls.length; i++) {
            if (moduls[i].getNom().equals(nomModul)) {
                return moduls[i];
            }
        }
        return null;
    }

    public boolean eliminarModul(String nomModul) {
        for (int i = 0; i < moduls.length; i++) {
            if (moduls[i].getNom().equals(nomModul)) {
                if (i == moduls.length - 1) {
                    moduls[i] = null;
                    System.out.println("Modul borrat");
                    numModuls--;
                    return true;
                }
                for (int j = i + 1; j < numModuls; j++) {
                    moduls[j - 1] = moduls[j];
                }
                moduls[numModuls - 1] = null;
                System.out.println("Modul borrat");
                numModuls--;
                return true;
            }
        }
        System.out.println("No s'ha trobat el modul");
        return false;
    }

    @Override
    public String toString() {
        return "CicleArray{" +
                "nom='" + nom + '\'' +
                ", numAlumnes=" + numAlumnes +
                ", moduls=" + Arrays.toString(getModuls()) +
                ", numModuls=" + numModuls +
                '}';
    }
}
