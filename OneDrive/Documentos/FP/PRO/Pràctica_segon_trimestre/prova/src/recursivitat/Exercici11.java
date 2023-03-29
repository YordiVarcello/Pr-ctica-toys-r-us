package recursivitat;

public class Exercici11 {
    public static void main(String[] args) {
        xifres2(1597);
    }

    public static int xifres2(int a) {
        if (a < 10) {
            System.out.println(a);
            return a;
        } else {
            System.out.println(a % 10);
            return xifres2(a / 10);
        }
    }
}
