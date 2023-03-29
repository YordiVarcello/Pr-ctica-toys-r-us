package ordenacio;

import java.util.Arrays;

public class Exercici2 {
    public static void main(String[] args) {
 int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        UtilitatsOrdenacio.bimbolla(array);
        System.out.println(Arrays.toString(array));
    }

}
