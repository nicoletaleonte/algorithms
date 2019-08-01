package stackAndQueue;

public class TestAnimalShelterLinkedList {
    public static void main(String[] args) {
        Node node = new Node("cat");
        AnimalShelterLinkedList animalShelterLinkedList = new AnimalShelterLinkedList();
        animalShelterLinkedList.addNode("dog", node);
        animalShelterLinkedList.dispay(node);
    }


}
