package objectes.SWPROTema4;

import java.util.ArrayList;
import java.util.Arrays;

public class ProvesArrayList {
    ArrayList<Modul> al;
    public ProvesArrayList() {
        al = new ArrayList<>();
    }

    public void proves() {
        mostraLlistaIndex();
        al.add(new Modul(5,"asdf"));
        al.add(new Modul(4,"pepito"));
        al.add(new Modul(1,"gori"));
        al.add(new Modul(12,"adsfgasaaaaa"));
    }
    public void mostraLlistaIndex(){
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Posició " + i + ":");
            System.out.println(al.get(i));
            System.out.println("---------------------");
            mostraLlistaIndex();
            al.remove(2);
            mostraLlista();
            Modul m2 = new Modul(14,"saf");
            al.add(2,m2);
            mostraLlistaIndex();
            al.remove(m2);mostraLlistaIndex();
            Modul altre = new Modul(3,"res");
            al.set(1,altre);
            mostraLlistaIndex();
        }
    }
    public void mostraLlista(){
        for (Modul modul : al) {
            System.out.println(modul);
        }
    }


    public static void main(String[] args) {
        ProvesArrayList p = new ProvesArrayList();
        p.proves();
    }
}
