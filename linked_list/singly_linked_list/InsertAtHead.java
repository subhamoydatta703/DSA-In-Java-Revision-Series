package linked_list.singly_linked_list;

public class InsertAtHead {
    public static Node instertAtHead(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;

        return newNode;
    }

    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);

        System.out.println("Before insert at head:");
        NodeTraversal.nodeTraversal(head);

        head = instertAtHead(head, 10);

        System.out.println("After insert at head:");
        NodeTraversal.nodeTraversal(head);
    }
}
