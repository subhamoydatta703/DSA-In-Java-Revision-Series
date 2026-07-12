package linked_list.doubly_linked_list;

public class DeleteAtHeadNode {
    public static DoublyNode deleteAtHeadNode(DoublyNode head) {
        if (head == null) return null;

        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return head;
    }

    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        head.next = new DoublyNode(20);
        head.next.prev = head;
        head.next.next = new DoublyNode(30);
        head.next.next.prev = head.next;

        System.out.println("Before delete at head:");
        NodeForwardTraversal.nodeForwardTraversal(head);

        head = deleteAtHeadNode(head);

        System.out.println("After delete at head:");
        NodeForwardTraversal.nodeForwardTraversal(head);
        System.out.println("New head previous: " + head.prev);
    }
}
