package linked_list.singly_linked_list;

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        first.next = second;

        System.out.println("First node data: " + first.data);
        System.out.println("Next node data: " + first.next.data);
    }
}
