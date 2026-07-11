package linked_list;

class DoublyNode {
    DoublyNode prev;
    int data;
    DoublyNode next;

    DoublyNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}

public class DoublyLinkedList {

    static void nodeForwardTraversal(DoublyNode head) {
        DoublyNode curr = head;
        while (curr != null) {
            System.out.println("Data: " + curr.data);
            curr = curr.next;
        }
        System.out.println("Null");
    }

    static void nodeBackwardTraversal(DoublyNode tail) {
        DoublyNode curr = tail;
        while (curr != null) {
            System.out.println("Data: " + curr.data);
            curr = curr.prev;
        }
        System.out.println("Null");
    }

    static DoublyNode insertAtHeadNode(DoublyNode head, int val) {
        DoublyNode newNode = new DoublyNode(val);
        if (head == null)
            return newNode;
        head.prev = newNode;
        newNode.next = head;
        System.out.println(
                "Node data: " + newNode.data + " Node prev: " + newNode.prev + " Node next: " + newNode.next.data);
        return newNode;

    }

    static DoublyNode insertAtPos(DoublyNode head, int pos, int val) {
        DoublyNode newNode = new DoublyNode(val);
        if (head == null)
            return newNode;
        DoublyNode curr = head;

        if (pos == 0) {
            return insertAtHeadNode(head, val);
        }

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
            return insertAtTail(head, val);
        }

        DoublyNode nextNode = curr.next;
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = nextNode;
        nextNode.prev = newNode;

        return head;

    }

    static DoublyNode insertAtTail(DoublyNode head, int val) {
        DoublyNode newNode = new DoublyNode(val);
        if (head == null)
            return newNode;
        DoublyNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = null;
        return head;
    }

    public static void main(String[] args) {

        // DoublyNode creation
        DoublyNode head = new DoublyNode(10);
        DoublyNode secNode = new DoublyNode(20);
        DoublyNode thirdNode = new DoublyNode(30);

        // connection b/w nodes
        head.prev = null;
        head.next = secNode;

        secNode.prev = head;
        secNode.next = thirdNode;

        thirdNode.prev = secNode;
        thirdNode.next = null;

        // traverse
        // forward traversal
        nodeForwardTraversal(head);

        System.out.println();
        System.out.println();
        // backward traversal
        nodeBackwardTraversal(thirdNode);

        // insert at head
        System.out.println();
        System.out.println();

        insertAtHeadNode(head, 5);
        // nodeForwardTraversal();
        System.out.println(head.prev.data + " " + head.data + " " + head.next.data);

        insertAtTail(head, 40);
        nodeForwardTraversal(head);

        System.out.println();
        System.out.println();
        insertAtPos(head, 2, 25);
        nodeForwardTraversal(head);

    }
}
