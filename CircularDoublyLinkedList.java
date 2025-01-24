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


    public void rotate() {
        if (size > 1) {
            header = header.next;
            trailer = trailer.next;
        }
    }



    public boolean isEmpty() {
    return size == 0; // Returns true if size is 0
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
    } while (current != header); // Stop when we loop back to the header

    System.out.println(); // Move to the next line after printing all elements
}
}
