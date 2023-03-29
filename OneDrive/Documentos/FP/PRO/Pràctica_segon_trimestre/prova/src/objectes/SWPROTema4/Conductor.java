package objectes.SWPROTema4;

public class Conductor {
    String nom;
    String datosContacto;

    public Conductor(String nom, String datosContacto) {
        this.nom = nom;
        this.datosContacto = datosContacto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDatosContacto() {
        return datosContacto;
    }

    public void setDatosContacto(String datosContacto) {
        this.datosContacto = datosContacto;
    }
}
