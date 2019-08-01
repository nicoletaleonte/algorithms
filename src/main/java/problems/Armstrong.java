package problems;

public class Armstrong {
    public static boolean isArmstrong(int n) {


        int suma = 0;
        int rez = n;
        int rez1 = n;
        int c = 0;
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);

        while (rez > 0) {
            c = rez % 10;
            int produs = 1;
            for(int i = 0; i < count; i++) {
                produs = produs * c;
            }
            System.out.println(produs + " " + c);
            suma = suma + produs;
            rez = rez / 10;
        }
        return suma == rez1;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
