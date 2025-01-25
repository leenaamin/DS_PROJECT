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
    private Node<E> header; // Represents the head of the list
    private Node<E> trailer; // Represents the tail of the list
    private int size = 0;

    // Nested static Node class
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

    // Rotate the list forward
    public void rotate() {
        if (size > 1) {
            header = header.next;
            trailer = trailer.next;
        }
    }

    // Rotate the list backward
    public void rotateBackward() {
        if (size > 1) {
            header = header.prev;
            trailer = trailer.prev;
        }
    }

    // Get the size of the list
    public int getSize() {
        return size;
    }

    // Get a formatted string for size information
    public String sizeInfo() {
        return "The size of the list is: " + size;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Print the elements of the list
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

    // Add an element to the front of the list
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e, null, null);

        if (isEmpty()) {
            newNode.next = newNode;
            newNode.prev = newNode;
            header = newNode;
            trailer = newNode;
        } else {
            newNode.next = header;
            newNode.prev = trailer;
            header.prev = newNode;
            trailer.next = newNode;
            header = newNode;
        }

        size++;
    }

    // Add an element to the end of the list
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, null, null);

        if (isEmpty()) {
            newNode.next = newNode;
            newNode.prev = newNode;
            header = newNode;
            trailer = newNode;
        } else {
            newNode.next = header;
            newNode.prev = trailer;
            trailer.next = newNode;
            header.prev = newNode;
            trailer = newNode;
        }

        size++;
    }

    // Remove and return the first element of the list
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        E removedData = header.data;

        if (size == 1) {
            header = null;
            trailer = null;
        } else {
            header = header.next;
            trailer.next = header;
            header.prev = trailer;
        }

        size--;
        return removedData;
    }

    // Remove and return the last element of the list
    public E removeLast() {
        if (isEmpty()) {
            return null;
        }

        E removedData = trailer.data;

        if (size == 1) {
            header = null;
            trailer = null;
        } else {
            trailer = trailer.prev;
            trailer.next = header;
            header.prev = trailer;
        }

        size--;
        return removedData;
    }
}
