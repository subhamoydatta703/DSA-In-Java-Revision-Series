package linked_list.doubly_linked_list;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        DoublyNode secNode = new DoublyNode(20);
        DoublyNode thirdNode = new DoublyNode(30);

        head.prev = null;
        head.next = secNode;

        secNode.prev = head;
        secNode.next = thirdNode;

        thirdNode.prev = secNode;
        thirdNode.next = null;

        NodeForwardTraversal.nodeForwardTraversal(head);

        System.out.println();
        System.out.println();
        NodeBackwardTraversal.nodeBackwardTraversal(thirdNode);

        System.out.println();
        System.out.println();

        InsertAtHeadNode.insertAtHeadNode(head, 5);
        System.out.println(head.prev.data + " " + head.data + " " + head.next.data);

        InsertAtTail.insertAtTail(head, 40);
        NodeForwardTraversal.nodeForwardTraversal(head);

        System.out.println();
        System.out.println();
        InsertAtPos.insertAtPos(head, 2, 25);
        NodeForwardTraversal.nodeForwardTraversal(head);
    }
}
