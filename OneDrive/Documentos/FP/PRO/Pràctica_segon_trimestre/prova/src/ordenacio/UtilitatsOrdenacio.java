package ordenacio;

public class UtilitatsOrdenacio {
    public static void bimbolla(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }
    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int index = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > index) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = index;
        }
    }
    public static void quickSort(int[] a, int esquerra, int dreta) {
        int i = esquerra;
        int j = dreta;
        int vPivot = a[(i + j) / 2];
        do {
            while (a[i] < vPivot) {
                i++;
            }
            while (a[j] > vPivot) {
                j--;
            }
            if (i <= j) {
                int aux = a[i];
                a[i] = a[j];
                a[j] = aux;
                i++;
                j--;
            }
        } while (i < j);
        if (esquerra < j) {
            quickSort(a, esquerra, j);
        }
        if (i < dreta) {
            quickSort(a, i, dreta);
        }
    }
    public static int cercaBinaria(int[] array, int a){
        int comprobacions = 0;
        int inici = 0;
        int fi = array.length-1;
        int mig;
        while(inici <= fi){
            comprobacions++;
            mig = (inici + fi) / 2;
            if(a == array[mig]){
                System.out.println("Comprobaicons: " + comprobacions);
                return mig;
            }else if(array[mig]>a){
                fi = mig-1;
            }else{
                inici = mig +1;
            }
        }
        System.out.println("Comprobaicons: " + comprobacions);
        return -1;
    }
}
