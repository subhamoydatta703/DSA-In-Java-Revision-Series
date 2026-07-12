package linked_list.doubly_linked_list;

public class NodeForwardTraversal {
    public static void nodeForwardTraversal(DoublyNode head) {
        DoublyNode curr = head;
        while (curr != null) {
            System.out.println("Data: " + curr.data);
            curr = curr.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        DoublyNode second = new DoublyNode(20);
        DoublyNode third = new DoublyNode(30);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        nodeForwardTraversal(head);
    }
}
