package recursivitat;

public class Exercici10 {
    public static void main(String[] args) {
        int a = 1234;
        xifres(a);
    }

    public static int xifres(int a) {
        if (a < 10) {
            System.out.println(a);
            return a;
        } else {
            String aux = String.valueOf(a);
            System.out.println(aux.charAt(0));
            return xifres(Integer.parseInt(aux.substring(1)));
        }
    }
}
