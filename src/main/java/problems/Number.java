package problems;

public class Number {
    public static void isPrimeThird(int n) {
        int cifra;
        int invers = 0;
        int verifica = 1;

        while (n != 0) {
            cifra = n % 10;
            invers = invers * 10 + cifra;
            n = n / 10;

        }
        System.out.println(invers);

        verifica = invers % 10 * invers / 10 % 10 * invers / 100 % 10;
        System.out.println(verifica);

        int numar = verifica;

        int div = 2;
        while (verifica != 1) {
            if (verifica % div == 0) {
                verifica = verifica / div;
            } else {
                div++;
            }
        }

        if (div == numar) {
            System.out.println("Produsul primelor numere este prima.");
        } else {
            System.out.println("Produsul primelor numere nu este prima.");
        }

    }

    public static void main(String[] args) {
        //isPrimeThird(997);
        prim2(997);
        System.out.println(prim(997));
        System.out.println(prim_recursiv(100, 50));
    }

    public static boolean prim(int numar) {
        if (numar < 2)
            return false;

        for (int i = 2; i < Math.sqrt(numar); i++) {
            if (numar % i == 0)
                return false;
        }
        return true;
    }

    public static void prim2(int verifica){

        int numar = verifica;

        int div = 2;
        while (verifica != 1) {
            if (verifica % div == 0) {
                verifica = verifica / div;
            } else {
                div++;
            }
        }

        if (div == numar) {
            System.out.println("Numarul este prim.");
        } else {
            System.out.println("Nu");
        }
    }

    public static boolean prim_recursiv(int numar, int i)
    {
        if(i > Math.sqrt(numar)) return true;
        if(numar < 2) return false;
        if(numar%i==0) return false;
        else
            return prim_recursiv(numar, i+1);
    }
}
