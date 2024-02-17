import linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.agregarHead(5);
        linkedList.agregarHead(7);
        linkedList.agregarHead(10);
        linkedList.agregarTail(20);
        // 0      1      2       3
        //[10] -> [7] -> [5] -> [20]
        linkedList.agregarPorPosicion(3, 5);
    }
}