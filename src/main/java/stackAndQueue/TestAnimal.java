package stackAndQueue;

import java.util.Vector;

public class TestAnimal {

    public static void main(String[] args) {

        Vector<EAnimal> animals = new Vector<>();
        animals.add(0, EAnimal.DOG);
        animals.add(1, EAnimal.DOG);
        animals.add(2, EAnimal.CAT);
        animals.add(3, EAnimal.CAT);
        animals.add(4, EAnimal.DOG);
        AnimalShelter animalShelter = new AnimalShelter(animals);


        for(int i = 0; i<animals.size(); i++){
            System.out.println(animals.get(i));
        }


        System.out.println(animalShelter.firstAnimal(EAnimal.CAT, animals));

        for(int i = 0; i<animals.size(); i++){
            System.out.println(animals.get(i));
        }
    }
}
