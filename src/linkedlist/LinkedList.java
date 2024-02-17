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

    public void agregarPorPosicion(int posicion, int valor) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if (posicion == 0) {
            agregarHead(valor);
        }else {
            // 0      1      2       3      4
            //[10] -> [7] -> [5] -> [5]-> [20]
            //[nodoactual] -> [5]
            //nodo agregar
            Node node = new Node(valor);
            Node actual = head;
            for (int i= 0; i < posicion-1; i++) {
                if(actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            //[0] -> [3] -> [5] -> [10]
            if(actual.next == null) {
                agregarTail(valor);
            } else {
                //[0] -> [3] -> [99]->[5]  -> [10]
                node.next = actual.next;
                actual.next = node;
            }
        }

        // Eliminar por posicion
        //Buscar por el nodo dada una posicion
        // eliminar todos los elementos
        // Eliminar por valor
    }
}
