package linked_list.doubly_linked_list;

public class DeleteAtTailNode {
    public static DoublyNode deleteAtTailNode(DoublyNode head) {
        if (head == null) return null;
        if (head.next == null) return null;

        DoublyNode curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
        return head;
    }

    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        head.next = new DoublyNode(20);
        head.next.prev = head;
        head.next.next = new DoublyNode(30);
        head.next.next.prev = head.next;

        System.out.println("Before delete at tail:");
        NodeForwardTraversal.nodeForwardTraversal(head);

        head = deleteAtTailNode(head);

        System.out.println("After delete at tail:");
        NodeForwardTraversal.nodeForwardTraversal(head);
    }
}
