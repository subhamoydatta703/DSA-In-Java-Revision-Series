package linked_list.singly_linked_list;

public class SinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;

        InsertAtTail.insertAtTail(head, 40);
        InsertAtTail.insertAtTail(head, 60);
        NodeTraversal.nodeTraversal(head);

        int count = NumOfNodes.numOfNodes(head, 0);
        int middle = count / 2;

        System.out.println(FindMidNode.findMidNode(head, middle).data);
    }
}
