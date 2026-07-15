package linked_list.singly_linked_list;

public class AddTwoNumbers {
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node curr1 = l1;
        Node curr2 = l2;
        int carry=0;
        Node dummy = new Node(0);
        Node currDummy = dummy;
        while (curr1 != null || curr2 != null) {
            int a = (curr1 != null) ? curr1.data : 0;
            int b = (curr2 != null) ? curr2.data : 0;
           int sum = a+b+carry;
                currDummy.next = new Node(sum %10);
                carry = sum /10;
            if(curr1!= null){
                curr1 = curr1.next;

            }
            if(curr2 !=null){
                curr2 = curr2.next;

            }
        currDummy = currDummy.next;
        }
        if(carry >0){
            currDummy.next = new Node(carry);
        }

        return dummy.next;

    }

    public static void main(String[] args) {
       
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        NodeTraversal.nodeTraversal(l1);
        System.out.println();
        NodeTraversal.nodeTraversal(l2);
        System.out.println();

        Node result = addTwoNumbers(l1, l2);
        NodeTraversal.nodeTraversal(result);
    }
}
