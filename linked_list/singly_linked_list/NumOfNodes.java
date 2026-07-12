package linked_list.singly_linked_list;

public class NumOfNodes {
    public static int numOfNodes(Node head, int count) {
        if (head == null) return -1;
        if (head.next == null) return 1;

        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Number of nodes: " + numOfNodes(head, 0));
    }
}
