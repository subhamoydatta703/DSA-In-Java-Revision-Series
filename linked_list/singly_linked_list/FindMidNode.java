package linked_list.singly_linked_list;

public class FindMidNode {
    public static Node findMidNode(Node head, int num) {
        if (head == null) return null;
        if (head.next == null) return head;

        Node curr = head;
        int i = 0;
        while (curr != null && i < num) {
            curr = curr.next;
            i++;
        }

        return curr;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int count = NumOfNodes.numOfNodes(head, 0);
        int middle = count / 2;
        Node midNode = findMidNode(head, middle);

        System.out.println("Middle node data: " + midNode.data);
    }
}
