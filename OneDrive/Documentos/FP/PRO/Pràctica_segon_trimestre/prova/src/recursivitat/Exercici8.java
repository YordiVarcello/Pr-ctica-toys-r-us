package recursivitat;

public class Exercici8 {
    public static void main(String[] args) {
        hanoi(3);
    }

    public static int hanoi(int a) {
        if (a == 1) {
            System.out.println("petit --> " + a);
            return a;
        } else {
            System.out.println("3 --> 2");
            System.out.println("3 --> 1");
            return hanoi(a - 1);
        }
    }
}
