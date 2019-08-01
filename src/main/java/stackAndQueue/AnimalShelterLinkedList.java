package stackAndQueue;

public class AnimalShelterLinkedList {
    public void addNode(String data, Node head) {
        Node n = head;
        if (head.data == null) {
            head.data = data;
        }
        while (n.next != null) {
            n.data = data;
            n = n.next;
        }

    }

    public void dispay(Node head) {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;

        }


    }

    public void removeNode(EAnimal data, Node head) {
        Node n = head;
        if (data.equals(head.data)) {
            head = head.next;
        }
        while (n.next != null) {
            if (n.data.equals(data)) {
                n = n.next;
            }
            n = n.next;
        }

    }
}
