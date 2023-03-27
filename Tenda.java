package treball;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tenda {
    private ArrayList<Jugueta> juguetes;
    private ArrayList<Venta> ventes;
    private double resultat;


    public Tenda(ArrayList<Jugueta> juguetes, ArrayList<Venta> ventes) {
        this.juguetes = juguetes;
        this.ventes = ventes;
    }

    public ArrayList<Venta> ventes_client_data(String identificadorClient, Date data) {
        ArrayList<Venta> resultat = new ArrayList<>();

        for (int i = 0; i < ventes.size(); i++) {
            if (ventes.get(i).getClient().getNom().equals(identificadorClient) && ventes.get(i).getData().before(data)) {
                resultat.add(ventes.get(i));
            }
        }
        return resultat;
    }

    public double facturacioClient(int identificadorClient) {
        resultat = 0;
        for (int i = 0; i < ventes.size(); i++) {
            Date actDate = new Date();
            if (ventes.get(i).getClient().getIdentificador() == identificadorClient && ventes.get(i).getData().getMonth() == actDate.getMonth() &&
                    ventes.get(i).getData().getYear() == actDate.getYear()) {
                resultat += ventes.get(i).getQuantitat();
            }
        }
        return resultat;
    }
    public ArrayList <Jugueta> juguetes_marca(String identificadorMarca) {
        ArrayList <Jugueta> juguetes = new ArrayList<>();

        for (int i = 0; i < this.juguetes.size(); i++) {
            if (this.juguetes.get(i).getMarca().equals(identificadorMarca)) {
                juguetes.add(this.juguetes.get(i));
            }
        }
        return juguetes;
    }
}

