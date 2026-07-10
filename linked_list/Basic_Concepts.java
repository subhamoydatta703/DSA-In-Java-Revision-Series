package linked_list;

class Node {
    int data;
    Node next;

    // method 1: flexible
    Node(int data) {
        this.data = data;
        this.next = null;
    }

    // method 2: simpler constructor design: have a drawback: not flexible
    // new Node(value, next node)
    // Node(int data, Node next){
    // this.data = data;
    // this.next = next;
    // }
}

public class Basic_Concepts {

    // node traversal
    static void nodeTraversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println("Data: " + curr.data);
            curr = curr.next;
        }
        System.out.println("Null");
    }

    // insert at head
    static Node instertAtHead(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;

        return newNode;
    }

    // insert at tail
    static Node insertAtTail(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null)
            return newNode;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    // delete at head position

    static Node deleteAtHead(Node head) {
        if (head == null)
            return null;

        head = head.next;
        return head;
    }

    // delete by value
    static Node delByValue(Node head, int val) {
        if (head == null)
            return null;

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

        // create a linked list

        // drawback of this simple structure is that i have to write down nodes
        // backwords. Which is not flexsible, but method 1 of the cromnstructor is more
        // flexible and shpould use that instead of the method 2

        // method 2:
        // Node second = new Node(20, null);
        // Node head = new Node(10, second);
        // // adding a next node
        // System.out.println(head.data);

        // Node head = new Node(10, new Node(20, new Node(30, null)));

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;

        // System.out.println("Head: "+head);
        // System.out.println("Head data: "+head.data);
        // System.out.println("Head next: "+head.next);
        // System.out.println("second: "+second);
        // System.out.println("second data: "+second.data);
        // System.out.println("second next: "+second.next);
        // System.out.println("third: "+third);
        // System.out.println("third data: "+third.data);
        // System.out.println("third next:"+third.next);

        insertAtTail(head, 40);
        nodeTraversal(head);

    }

}
