package ordenacio;

public class Exercici5 {
    public static void main(String[] args) {
        int[] a = new int[1000];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        System.out.println(UtilitatsOrdenacio.cercaBinaria(a,15));
    }
}
