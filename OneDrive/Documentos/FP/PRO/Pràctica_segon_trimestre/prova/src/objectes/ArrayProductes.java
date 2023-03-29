package objectes;

public class ArrayProductes {
    private Producte[] productes;
    private int index;

    public ArrayProductes(int longitud) {
        this.productes = new Producte[longitud];
        this.index = 0;
    }

    public ArrayProductes() {
        this.productes = new Producte[10];
        this.index = 0;
    }

    //getters


    public Producte[] getProductes() {
        Producte[] tmp = new Producte[index];
        for (int i = 0; i < index; i++) {
            tmp[i] = productes[i];
        }
        return tmp;
    }

    public int getIndex() {
        return index;
    }

    public void introduirArray(Producte[] array) {
        if (array.length > productes.length) {
            System.out.println("Array massa llarg");
        } else {
            for (int i = 0; i < array.length; i++) {
                productes[i] = array[i];
            }
            index = array.length;
        }
    }

    public boolean esPle() {
        for (int i = 0; i < productes.length; i++) {
            if (productes[i] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean afegirProducte(Producte producte) {
        if (producte == null) {
            System.out.println("Producte buit");
            return false;
        } else if (!esPle()) {
productes[index] = new Producte(producte.getNom(), producte.getPreu());
index++;
            return true;
        } else {
            System.out.println("Array ple");
            return false;
        }
    }

    public void borrarProducte(String nom) {
        boolean trobat = false;
        if (index == 0) {
            System.out.println("Array buit");
        } else {
            for (int i = 0; i < index && !trobat; i++) {
                if (nom.equals(productes[i].getNom())) {
                    trobat = true;
                    if (i == index - 1) {
                        productes[i] = null;
                    } else{
                        for (int j = i; j < index - 1; j++) {
                            productes[j] = productes[j + 1];
                        }
                    }
                    index--;
                }
            }
        }
        if (!trobat) {
            System.out.println("No s'ha trobat cap coincidència");
        }
    }


    public Producte producteA(int posicio) {
        if (productes[posicio] == null) {
            return null;                                    //null???--------------
        } else {
            return productes[posicio];
        }
    }

    @Override
    public String toString() {
        if(index == 0){
            return "Array buit";
        }
String cadena = "{";
        for (int i = 0; i < index; i++) {
            cadena += productes[i].toString();
        }
        cadena += "}";
        return cadena;
    }
}
