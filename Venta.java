package treball;

import java.util.Date;

public class Venta {
    private Jugueta jugueta;
    private Client client;
    private int quantitat;
    private Date data;

    public Venta(Jugueta jugueta, Client client, int quantitat, Date data) {
        this.jugueta = jugueta;
        this.client = client;
        this.quantitat = quantitat;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
