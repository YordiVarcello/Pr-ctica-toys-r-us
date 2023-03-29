package recursivitat;

public class Exercici12 {
    public static void main(String[] args) {
        sumes(3);
    }

    public static int sumes(int a) {
        if (a == 1) {
            System.out.print(1);
        }
        if (a > 1) {
            for (int i = 1; i <= a; i++) {
                System.out.println(i + " + " + sumes(a - i));
            }
        }

        return 1;
    }
}
