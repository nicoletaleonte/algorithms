package first;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

//        Sapiens sapiens = new Sapiens("Ana", 20, 3);
//        sapiens.setNume("Maria");
//        sapiens.setVarsta(40);
//        sapiens.setNrCopii(10);
//
//        Sapiens sapiens1 = new Sapiens("Ion", 23, 3);
//        Sapiens sapiens2 = new Sapiens("Ioana", 24, 5);
//        Sapiens sapiens3 = new Sapiens("Mini", 30, 2);
//        Sapiens sapiens4 = new Sapiens("Andrei", 20, 1);
//
//        Sapiens.changeContinent("Europa");
//        System.out.println(sapiens.toString());
//        System.out.println(sapiens1.toString());
//        System.out.println(sapiens2.toString());
//        System.out.println(sapiens3.toString());
//        System.out.println(sapiens4.toString());
//
//        Sapiens sapiens5 = new Sapiens("Nico", 27, 1, 2);
//        System.out.println(sapiens5.toString());
//        Sapiens sapiens6 = new Sapiens("Silviu", 27, 1, 2);
//        System.out.println(sapiens6.toString());
//        Sapiens sapiens7 = new Sapiens("Leni");
//        System.out.println(sapiens7.toString());
//
//        Kid kid = new Kid();
//        System.out.println(kid.toString());
//        List<String> toys = new ArrayList<>();
//        kid.addToys(toys, "masini");
//        kid.addToys(toys, "papausi");
//        kid.addToys(toys, "creioane");
//        kid = new Kid("Marius", 20, toys);
//        System.out.println(kid.toString());

//        Address address = new Address("Iasi", "Iasi","Romania");
//        System.out.println(address.printCity("Iasi"));
        Kid kid = new Kid();
        System.out.println(kid.checkAge(4));

        Sapiens sapiens8 = new Sapiens("Ana", -50, 2);
        System.out.println(sapiens8.checkAge(sapiens8.getVarsta()));




    }

}
