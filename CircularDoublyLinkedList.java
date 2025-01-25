/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Admin
 */
public class CircularDoublyLinkedList<E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        Node(E data, Node<E> next, Node<E> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void rotate() {
        if (size > 1) {
            header = header.next;
            trailer = trailer.next;
        }
    }

    public void rotateBackward() {
        if (size > 1) {
            header = header.prev;
            trailer = trailer.prev;
        }
    }
    
    public int getSize() {
        return size;
    }
    public String sizeInfo() {
        return "The size of the list is: " + size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        Node<E> current = header;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != header);

        System.out.println();
    }
}
