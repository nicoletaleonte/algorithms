package stackAndQueue;

import java.util.Stack;

public class TestAnimalQueue {

    public static void main(String[] args) {
        Animal animal = new Dog("dog");
        Animal animal1 = new Dog("dog1");
        Animal animal2 = new Cat("cat");
        Animal animal3 = new Cat("cat1");

        AnimalQueue animalQueue = new AnimalQueue();
        animalQueue.enqueue(animal);
        animalQueue.enqueue(animal1);
        animalQueue.enqueue(animal2);
        animalQueue.enqueue(animal3);

        animalQueue.dequeueAny();
        Stack<Integer>n = new Stack<>();
    }


}
