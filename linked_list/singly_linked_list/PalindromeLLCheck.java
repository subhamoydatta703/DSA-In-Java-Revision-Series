package linked_list.singly_linked_list;

public class PalindromeLLCheck {
    public static Node reverseList(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public static boolean isPalindrome(Node head) {
        Node fast = head;
        Node slow = head;
        Node curr = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) {
            slow = slow.next;
        }
        Node revCurr = reverseList(slow);
        while (curr != null && revCurr != null) {
            if (curr.data != revCurr.data) {
                return false;
            } else {
                curr = curr.next;
                revCurr = revCurr.next;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        InsertAtTail.insertAtTail(head, 20);
        InsertAtTail.insertAtTail(head, 10);
        NodeTraversal.nodeTraversal(head);
        System.out.println();
        boolean isPalindromeVal = isPalindrome(head);
        if (isPalindromeVal) {
            System.out.println("The Linked List is palindrome");
        } else {
            System.out.println("The Linked List is not a palindrome");
        }
    }
}
