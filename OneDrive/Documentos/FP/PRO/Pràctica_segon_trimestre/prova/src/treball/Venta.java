package treball;

import java.time.LocalDate;
import java.util.Date;

public class Venta {
    private Jugueta jugueta;
    private Client client;
    private int quantitat;
    private double total_net;
    private double descompte;
    private LocalDate data;

    public Venta(Jugueta jugueta, Client client, int quantitat,double total_net, double descompte, LocalDate data) {
        this.jugueta = jugueta;
        this.client = client;
        this.quantitat = quantitat;
        this.total_net = total_net;
        this.descompte = descompte;
        this.data = data;
    }

    public Jugueta getJugueta() {
        return jugueta;
    }

    public void setJugueta(Jugueta jugueta) {
        this.jugueta = jugueta;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getTotal_net() {
        return total_net;
    }

    public double getDescompte() {
        return descompte;
    }
}
