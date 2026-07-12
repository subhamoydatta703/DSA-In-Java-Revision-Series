package linked_list.doubly_linked_list;

public class InsertAtTail {
    public static DoublyNode insertAtTail(DoublyNode head, int val) {
        DoublyNode newNode = new DoublyNode(val);
        if (head == null) return newNode;

        DoublyNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = null;
        return head;
    }

    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        head.next = new DoublyNode(20);
        head.next.prev = head;

        System.out.println("Before insert at tail:");
        NodeForwardTraversal.nodeForwardTraversal(head);

        head = insertAtTail(head, 30);

        System.out.println("After insert at tail:");
        NodeForwardTraversal.nodeForwardTraversal(head);
    }
}
