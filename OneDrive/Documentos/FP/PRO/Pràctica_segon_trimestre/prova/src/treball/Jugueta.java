package treball;


public class Jugueta {

private int identificador;
    private String nom;
    private Marca marca;
    private double preu;
    private String descripcio;
    private String tipusJugueta;
    private RangoEdad rangoEdad;
    private int stock;

    public Jugueta(int identificador, String nom, Marca marca, double preu, String descripcio, String tipusJugueta, int stock, RangoEdad rangoEdad) {
        this.identificador = identificador;
        this.nom = nom;
        this.marca = marca;
        this.preu = preu;
        this.descripcio = descripcio;
        this.tipusJugueta = tipusJugueta;
        this.stock = stock;
        this.rangoEdad = rangoEdad;
    }

    public String getNom() {
        return nom;
    }

    public Marca getMarca() {
        return marca;
    }

    public double getPreu() {
        return preu;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public String getTipusJugueta() {
        return tipusJugueta;
    }

    public RangoEdad getRangoEdad() {
        return rangoEdad;
    }

    public int getStock() {
        return stock;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
