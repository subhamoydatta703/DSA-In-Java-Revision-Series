package linked_list.doubly_linked_list;

public class DeleteAtPos {
    public static DoublyNode deleteAtPos(DoublyNode head, int pos) {
        if (pos < 0) {
            System.out.println("Position out of range");
            return head;
        }

        if (head == null) return null;

        if (pos == 0) {
            return DeleteAtHeadNode.deleteAtHeadNode(head);
        }

        DoublyNode curr = head;
        int i = 0;
        while (curr != null && pos > 0 && i < pos - 1) {
            curr = curr.next;
            i++;
        }

        if (curr == null || curr.next == null) {
            System.out.println("Position out of range");
            return head;
        }

        if (curr.next.next == null) {
            return DeleteAtTailNode.deleteAtTailNode(head);
        }

        DoublyNode val = curr.next.next;
        curr.next = val;
        val.prev = curr;

        return head;
    }

    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        head.next = new DoublyNode(20);
        head.next.prev = head;
        head.next.next = new DoublyNode(30);
        head.next.next.prev = head.next;

        System.out.println("Before delete at position:");
        NodeForwardTraversal.nodeForwardTraversal(head);

        head = deleteAtPos(head, 1);

        System.out.println("After deleting position 1:");
        NodeForwardTraversal.nodeForwardTraversal(head);
    }
}
