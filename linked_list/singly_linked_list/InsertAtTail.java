package linked_list.singly_linked_list;

public class InsertAtTail {
    public static Node insertAtTail(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) return newNode;

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);

        System.out.println("Before insert at tail:");
        NodeTraversal.nodeTraversal(head);

        head = insertAtTail(head, 30);

        System.out.println("After insert at tail:");
        NodeTraversal.nodeTraversal(head);
    }
}
