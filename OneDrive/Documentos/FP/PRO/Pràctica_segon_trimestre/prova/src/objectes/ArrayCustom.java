package objectes;

import java.util.Arrays;

public class ArrayCustom {
    private int[] posicions;
    private int index;

    public ArrayCustom(int longitud) {
        this.posicions = new int[longitud];
        this.index = 0;
    }

    public ArrayCustom() {
        this.posicions = new int[10];
        this.index = 0;
    }
    //getters


    public int[] getPosicions() {
        int[] tmp = new int[index];
        for (int i = 0; i < index; i++) {
            tmp[i] = posicions[i];
        }
        return tmp;
    }

    public int getIndex() {
        return index;
    }

    public void introduirArray(int[] array) {
        if (array.length > posicions.length) {
            System.out.println("Array massa llarg");
        } else {
            for (int i = 0; i < array.length; i++) {
                posicions[i] = array[i];
            }
            index = array.length;
        }
    }

    public boolean esPle() {
        for (int i = 0; i < posicions.length; i++) {
            if (posicions[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean afegirValor(int valor) {
        if (valor < 1) {
            System.out.println("Només valors majors que 0");
            return false;
        } else if (!esPle()) {
            posicions[index] = valor;
            return true;
        } else {
            System.out.println("Array ple");
            return false;
        }
    }

    public void borrarValor(int valor) {
        boolean trobat = false;
        if (index == 0) {
            System.out.println("Array buit");
        } else {
            for (int i = 0; i < index && !trobat; i++) {
                if (posicions[i] == valor) {
                    trobat = true;
                    if (valor == index - 1) {
                        posicions[valor] = 0;
                    } else{
                        for (int j = i; j < index - 1; j++) {
                            posicions[j] = posicions[j + 1];
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


    public int valorA(int posicio) {
        if (posicions[posicio] == 0) {
            return -1;
        } else {
            return posicions[posicio];
        }
    }

    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < index-1; i++) {
            System.out.print(posicions[i] + ", ");
        }
        System.out.print(posicions[posicions.length-1] + "]\n");
    }
}
