package first;

public class Mistake {

    public static void main(String[] args) {

        int j = 10;
        int a=j++; // a=10, j=11;
        int b = ++a; //b-11, a=11

        int i;
        for (i = 100; i >=0;  --i){
            System.out.print(i + " ");
        }
        System.out.println("merge bine");
    }

}
