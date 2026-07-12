package linked_list.singly_linked_list;

public class DeleteAtHead {
    public static Node deleteAtHead(Node head) {
        if (head == null) return null;

        head = head.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Before delete at head:");
        NodeTraversal.nodeTraversal(head);

        head = deleteAtHead(head);

        System.out.println("After delete at head:");
        NodeTraversal.nodeTraversal(head);
    }
}
