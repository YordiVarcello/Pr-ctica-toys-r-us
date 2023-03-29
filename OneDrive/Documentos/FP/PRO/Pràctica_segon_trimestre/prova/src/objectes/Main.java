package objectes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
ArrayProductes ap = new ArrayProductes(5);
ap.afegirProducte(new Producte("chocolate", 1.5));
ap.afegirProducte(new Producte("Quesitos", 2.3));
        System.out.println(ap.toString());
        ap.borrarProducte("Quesitos");
        System.out.println(ap.toString());
        System.out.println(ap.producteA(0).toString());

    }
}