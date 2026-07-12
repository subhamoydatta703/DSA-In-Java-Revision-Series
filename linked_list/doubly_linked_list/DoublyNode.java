package linked_list.doubly_linked_list;

public class DoublyNode {
    public DoublyNode prev;
    public int data;
    public DoublyNode next;

    public DoublyNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public static void main(String[] args) {
        DoublyNode first = new DoublyNode(10);
        DoublyNode second = new DoublyNode(20);
        first.next = second;
        second.prev = first;

        System.out.println("First node data: " + first.data);
        System.out.println("Next node data: " + first.next.data);
        System.out.println("Previous node data: " + second.prev.data);
    }
}
