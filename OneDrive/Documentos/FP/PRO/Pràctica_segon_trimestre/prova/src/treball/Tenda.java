package treball;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Tenda {
    private ArrayList<Jugueta> juguetes;
    private ArrayList<Venta> ventes;
    private ArrayList<Client> clients;
    private ArrayList<Marca> marques;
    private ArrayList<Proveidor> proveidors;
    private double resultat;

    public Tenda() {
        this.juguetes = new ArrayList<>();
        this.ventes = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.marques = new ArrayList<>();
        this.proveidors = new ArrayList<>();
    }
    public void afegirJugueta(Jugueta jugueta){
        this.juguetes.add(jugueta);
    }
    public void novaVenta(Venta venta){
        this.ventes.add(venta);
    }
    public void afegirClient(Client client){
        this.clients.add(client);
    }
    public void afegirProveidor(Proveidor proveidor){
        this.proveidors.add(proveidor);
    }
    public void afegirMarca(Marca marca){
        this.marques.add(marca);
    }
    public void eliminarJugueta(int identificadorJugueta){
        for (int i = 0; i < juguetes.size(); i++) {
            if(juguetes.get(i).getIdentificador() == identificadorJugueta){
                juguetes.remove(i);
                break;
            }
        }
    }
    public void eliminarClient(int identificadorClient){
        for (int i = 0; i < clients.size(); i++) {
            if(juguetes.get(i).getIdentificador() == identificadorClient){
                juguetes.remove(i);
                break;
            }
        }
    }


    public ArrayList<Venta> ventes_client_data(String identificadorClient, LocalDate data) {
        ArrayList<Venta> resultat = new ArrayList<>();
        for (int i = 0; i < ventes.size(); i++) {
            if (ventes.get(i).getClient().getNom().equals(identificadorClient) && ventes.get(i).getData().isBefore(data)) {
                resultat.add(ventes.get(i));
            }
        }
        return resultat;
    }

    public double facturacioClient(int identificadorClient) {
        resultat = 0;
        for (int i = 0; i < ventes.size(); i++) {
            Date actDate = new Date();
            if (ventes.get(i).getClient().getIdentificador() == identificadorClient && ventes.get(i).getData().getMonth().equals(LocalDate.now().getMonth()) &&
                    ventes.get(i).getData().getYear()==LocalDate.now().getYear()) {
                resultat += ventes.get(i).getQuantitat();
            }
        }
        return resultat;
    }

    public int compres_jugueta_data(int identificadorJugueta, LocalDate data){
        int numeroVentes = 0;
        for (int i = 0; i < ventes.size(); i++) {
            if(ventes.get(i).getJugueta().getIdentificador() == identificadorJugueta && ventes.get(i).getData().isBefore(data)){
                numeroVentes += ventes.get(i).getQuantitat();
            }
        }
        return numeroVentes;
    }
    public double facturacio_jugueta_mes_anterior(int identificadorJugueta){

        resultat = 0;
int mesAnterior;
if(LocalDate.now().getMonth().getValue() == 1){
    mesAnterior = 12;
}else{
    mesAnterior = LocalDate.now().getMonth().getValue()-1;
}

        for (int i = 0; i < ventes.size(); i++) {
            if(ventes.get(i).getData().getMonth().getValue() == mesAnterior && ventes.get(i).getJugueta().getIdentificador() == identificadorJugueta){
                resultat += ventes.get(i).getTotal_net();
            }
        }
        return resultat;
    }

    public ArrayList<String> quinProveidorTeLaJugueta(String nomJugueta){
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < proveidors.size(); i++) {
            if(proveidors.get(i).teJugueta(nomJugueta)){
temp.add(proveidors.get(i).getJugueta(nomJugueta));
            }
        }
        return temp;
    }
    public ArrayList<Jugueta> juguetaPerMarca(String nomMarca){
        ArrayList<Jugueta> temp = new ArrayList<>();
        for (int i = 0; i < juguetes.size(); i++) {
            if(juguetes.get(i).getMarca().getNom().equals(nomMarca)){
                temp.add(juguetes.get(i));
            }
        }
        return temp;
    }
}

