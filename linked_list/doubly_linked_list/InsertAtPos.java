package linked_list.doubly_linked_list;

public class InsertAtPos {
    public static DoublyNode insertAtPos(DoublyNode head, int pos, int val) {
        if (pos < 0) {
            System.out.println("Position out of range");
            return head;
        }

        DoublyNode newNode = new DoublyNode(val);
        if (head == null) return newNode;

        if (pos == 0) {
            return InsertAtHeadNode.insertAtHeadNode(head, val);
        }

        DoublyNode curr = head;
        int i = 0;
        while (curr != null && pos > 0 && i < pos - 1) {
            curr = curr.next;
            i++;
        }

        if (curr == null) {
            System.out.println("Position out of range");
            return head;
        }

        if (curr.next == null) {
            return InsertAtTail.insertAtTail(head, val);
        }

        DoublyNode nextNode = curr.next;
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = nextNode;
        nextNode.prev = newNode;

        return head;
    }

    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        head.next = new DoublyNode(30);
        head.next.prev = head;

        System.out.println("Before insert at position:");
        NodeForwardTraversal.nodeForwardTraversal(head);

        head = insertAtPos(head, 1, 20);

        System.out.println("After inserting 20 at position 1:");
        NodeForwardTraversal.nodeForwardTraversal(head);
    }
}
