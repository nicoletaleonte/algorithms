package algorithms;

public class MergeSort {
    public static void merge(int a[], int l, int m, int r) {
        int i, j = 0;
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (i = 0; i < n1; i++) {
            L[i] = a[i + l];
        }
        for (j = 0; j < n2; j++) {
            R[j] = a[j + m + 1];
        }

        i = 0;
        j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int a[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);

            merge(a, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 41, 52, 26, 38, 57, 9, 49};
        mergeSort(a, 0, 7);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
