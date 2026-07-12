package linked_list.singly_linked_list;

public class DeleteByValue {
    public static Node delByValue(Node head, int val) {
        if (head == null) return null;

        if (head.data == val) {
            head = head.next;
            return head;
        }

        Node curr = head;
        while (curr.next != null && curr.next.data != val) {
            curr = curr.next;
        }

        if (curr.next == null) {
            return head;
        }

        curr.next = curr.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Before delete by value:");
        NodeTraversal.nodeTraversal(head);

        head = delByValue(head, 20);

        System.out.println("After deleting value 20:");
        NodeTraversal.nodeTraversal(head);
    }
}
