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

    // Traverses the list from head to tail and prints each node's data.
    static void nodeForwardTraversal(DoublyNode head) {
        DoublyNode curr = head;
        while (curr != null) {
            System.out.println("Data: " + curr.data);
            curr = curr.next;
        }
        System.out.println("Null");
    }

    // Traverses the list from tail to head and prints each node's data.
    static void nodeBackwardTraversal(DoublyNode tail) {
        DoublyNode curr = tail;
        while (curr != null) {
            System.out.println("Data: " + curr.data);
            curr = curr.prev;
        }
        System.out.println("Null");
    }

    // Inserts a new node at the beginning of the doubly linked list.
    static DoublyNode insertAtHeadNode(DoublyNode head, int val) {
        DoublyNode newNode = new DoublyNode(val);
        if (head == null)
            return newNode;
        head.prev = newNode;
        newNode.next = head;
        return newNode;

    }

    // Inserts a new node at the end of the doubly linked list.
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

    // Inserts a new node at the given zero-based position.
    static DoublyNode insertAtPos(DoublyNode head, int pos, int val) {
        if (pos < 0) {
            System.out.println("Position out of range");
            return head;
        }
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

    // Deletes the first node of the doubly linked list.
    static DoublyNode deleteAtHeadNode(DoublyNode head) {
        if (head == null)
            return null;

        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return head;
    }

    // Deletes the last node of the doubly linked list.
    static DoublyNode deleteAtTailNode(DoublyNode head) {

        if (head == null)
            return null;

        if (head.next == null)
            return null;
        DoublyNode curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;

        return head;
    }

    // Deletes the node at the given zero-based position.
    static DoublyNode deleteAtPos(DoublyNode head, int pos) {
        if (pos < 0) {
            System.out.println("Position out of range");
            return head;
        }

        if (head == null)
            return null;
        DoublyNode curr = head;
        int i = 0;
        if (pos == 0) {
            return deleteAtHeadNode(head);
        }

        while (curr != null && pos > 0 && i < pos - 1) {
            curr = curr.next;
            i++;
        }

        if (curr == null || curr.next == null) {
            System.out.println("Position out of range");
            return head;
        }

        if (curr.next.next == null) {
            return deleteAtTailNode(head);
        }

        DoublyNode val = curr.next.next;
        curr.next = val;
        val.prev = curr;

        return head;
    }

    // reverse a doubly linked list
    static DoublyNode revDoublyLL(DoublyNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        DoublyNode curr = head;
        DoublyNode tail = head;
        while (curr != null) {
            DoublyNode temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            tail = curr;
            curr = temp;
        }

        return tail;
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
