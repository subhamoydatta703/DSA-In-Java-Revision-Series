package linked_list.doubly_linked_list;

public class NodeBackwardTraversal {
    public static void nodeBackwardTraversal(DoublyNode tail) {
        DoublyNode curr = tail;
        while (curr != null) {
            System.out.println("Data: " + curr.data);
            curr = curr.prev;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        DoublyNode second = new DoublyNode(20);
        DoublyNode tail = new DoublyNode(30);

        head.next = second;
        second.prev = head;
        second.next = tail;
        tail.prev = second;

        nodeBackwardTraversal(tail);
    }
}
