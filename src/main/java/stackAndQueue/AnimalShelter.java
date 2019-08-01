package stackAndQueue;

import java.util.Vector;

public class AnimalShelter {

    private Vector animals;
    public AnimalShelter(Vector<EAnimal>animals){
        this.animals = animals;
    }
    public String firstAnimal(EAnimal animal, Vector<EAnimal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).equals(animal)) {
               System.out.println(animals.get(i));
                return animals.remove(i) + " - a fost luat un animal";
            }
        }
        return "Nu a fost gasit animalul";
    }


}
