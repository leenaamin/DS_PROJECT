package project;

public class TestMain {
    public static void main(String[] args) {
        CircularDoublyLinkedList<Integer> list = new CircularDoublyLinkedList<>();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);

        System.out.println("List is :");
        list.print();

        list.rotate();
        System.out.println("List after forward rotation:");
        list.print();

        list.rotateBackward();
        System.out.println("List after backward rotation:");
        list.print();

        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
