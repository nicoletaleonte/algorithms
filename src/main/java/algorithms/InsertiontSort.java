package algorithms;

public class InsertiontSort {
    public static void main(String[] args) {
        int aux, j;
        int a[];
        a = new int[]{31, 41, 59, 26, 41, 58};

        for (int i = 1; i < a.length; i++) {
            aux = a[i];
            j = i - 1;
            while (j >= 0 && a[j] < aux) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = aux;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
