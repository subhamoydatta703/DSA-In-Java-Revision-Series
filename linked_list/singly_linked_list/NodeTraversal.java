package linked_list.singly_linked_list;

public class NodeTraversal {
    public static Node nodeTraversal(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.println("Data: " + curr.data);
            curr = curr.next;
        }

        System.out.println("Null");
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        nodeTraversal(head);
    }
}
