package linked_list.singly_linked_list;

public class RemoveNthNodeFromEnd {
    public static Node removeNthEnd(Node head, int n) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;

        Node dummy = new Node(-1);
        dummy.next = head;
        Node fast = dummy, slow = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;

        InsertAtTail.insertAtTail(head, 40);
        InsertAtTail.insertAtTail(head, 60);
        NodeTraversal.nodeTraversal(head);
        System.out.println();
        removeNthEnd(head, 1);
        NodeTraversal.nodeTraversal(head);
    }
}
