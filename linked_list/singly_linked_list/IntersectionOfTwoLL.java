package linked_list.singly_linked_list;

public class IntersectionOfTwoLL {
    public Node getIntersectionNode(Node headA, Node headB) {
           if (headA == null || headB == null) return null;

        Node a = headA, b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
    public static void main(String[] args) {
                IntersectionOfTwoLL solution = new IntersectionOfTwoLL();

        
        Node common = new Node(8);
        common.next = new Node(4);
        common.next.next = new Node(5);

        
        Node headA = new Node(4);
        headA.next = new Node(1);
        headA.next.next = common;

        
        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = new Node(1);
        headB.next.next.next = common;

        Node intersection = solution.getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersected at node with value: " + intersection.data);
        } else {
            System.out.println("No intersection");
        }

        
        Node headC = new Node(2);
        headC.next = new Node(6);
        headC.next.next = new Node(4);

        Node headD = new Node(1);
        headD.next = new Node(5);

        Node intersection2 = solution.getIntersectionNode(headC, headD);
        System.out.println(intersection2 == null ? "No intersection" : "Intersected at: " + intersection2.data);
    
    }
}
