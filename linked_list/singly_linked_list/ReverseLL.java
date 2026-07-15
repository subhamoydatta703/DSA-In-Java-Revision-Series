package linked_list.singly_linked_list;

public class ReverseLL {
    public static Node reverseList(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        NodeTraversal.nodeTraversal(head);
        System.out.println();
        // reverseList(head);
        NodeTraversal.nodeTraversal(reverseList(head));
    }
}
