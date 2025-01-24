package project;

public class TestMain {
    public static void main(String[] args) {
        CircularDoublyLinkedList<Integer> list = new CircularDoublyLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("List is :");
        list.print();

        list.rotate();
        System.out.println("List after rotation:");
        list.print();

        list.rotate();
        System.out.println("List after another rotation:");
        list.print();

        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
