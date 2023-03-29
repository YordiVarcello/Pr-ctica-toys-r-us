package ordenacio;

import java.util.Arrays;

public class Exercici3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        UtilitatsOrdenacio.insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
