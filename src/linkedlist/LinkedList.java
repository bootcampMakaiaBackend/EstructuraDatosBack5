package linkedlist;

public class LinkedList {
    //nodo -> pointer
    class Node {
        int value;
        Node next = null;
        Node(int value){
            this.value = value;
        }
    }
    //head
    protected Node head = null;
    //tail
    protected Node tail = null;

    //[5]->[7]->[10]
    // agregar elementos en la parte delantera.
    public void agregarHead(int valor) {
        Node nuevonodo = new Node(valor);
        nuevonodo.next = head;
        head = nuevonodo;
        if(nuevonodo.next == null){
            tail = nuevonodo;
        }
    }   //head                   //tail
       // [10] -> [7] -> [5] -> null
       // [10] -> [7] -> [5] -> [20]
    public void agregarTail(int valor){
        Node nuevoNodo = new Node(valor);
        if(tail == null){
            head = nuevoNodo;
            tail = nuevoNodo;
        }
        tail.next = nuevoNodo;
        tail = nuevoNodo;
    }
}
