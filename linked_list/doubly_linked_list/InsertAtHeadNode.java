package linked_list.doubly_linked_list;

public class InsertAtHeadNode {
    public static DoublyNode insertAtHeadNode(DoublyNode head, int val) {
        DoublyNode newNode = new DoublyNode(val);
        if (head == null) return newNode;

        head.prev = newNode;
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(20);
        head.next = new DoublyNode(30);
        head.next.prev = head;

        System.out.println("Before insert at head:");
        NodeForwardTraversal.nodeForwardTraversal(head);

        head = insertAtHeadNode(head, 10);

        System.out.println("After insert at head:");
        NodeForwardTraversal.nodeForwardTraversal(head);
        System.out.println("New head previous: " + head.prev);
    }
}
