package treball;

import java.util.ArrayList;

public class Proveidor {
    private String nom;
    private String telefono;
    private String eMail;
    private String direccio;
    private ArrayList<Jugueta> cataleg;

    public Proveidor(String nom, String telefono, String eMail, String direccio) {
        this.nom = nom;
        this.telefono = telefono;
        this.eMail = eMail;
        this.direccio = direccio;
    }

    public ArrayList<Jugueta> getCataleg() {
        return cataleg;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

}

