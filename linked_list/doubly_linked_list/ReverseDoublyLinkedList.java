package linked_list.doubly_linked_list;

public class ReverseDoublyLinkedList {
    public static DoublyNode revDoublyLL(DoublyNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        DoublyNode curr = head;
        DoublyNode tail = head;
        while (curr != null) {
            DoublyNode temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            tail = curr;
            curr = temp;
        }

        return tail;
    }

    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        head.next = new DoublyNode(20);
        head.next.prev = head;
        head.next.next = new DoublyNode(30);
        head.next.next.prev = head.next;

        System.out.println("Before reverse:");
        NodeForwardTraversal.nodeForwardTraversal(head);

        head = revDoublyLL(head);

        System.out.println("After reverse:");
        NodeForwardTraversal.nodeForwardTraversal(head);
    }
}
