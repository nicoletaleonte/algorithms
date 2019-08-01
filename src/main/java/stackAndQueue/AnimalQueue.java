package stackAndQueue;

import java.util.LinkedList;

public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal animal){
        animal.setOrder(order);
        order++;

        if(animal instanceof Dog) dogs.add((Dog) animal);
        else if(animal instanceof Cat) cats.add((Cat) animal);
    }

    public Animal dequeueAny(){
        if(dogs.isEmpty()) {
            return dequeueCats();
        } else if (cats.isEmpty()){
            return dequeueDogs();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        if(dog.isOrderThan(cat)){
            return dequeueDogs();
        } else {
            return dequeueCats();
        }
    }

    private Dog dequeueDogs() {
        return dogs.poll();
    }

    private Cat dequeueCats() {
        return cats.poll();
    }

}
