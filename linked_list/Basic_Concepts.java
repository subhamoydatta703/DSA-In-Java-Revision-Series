package linked_list;

class  Node{
    int data;
    Node next;
    // method 1: flexible
    Node(int data){
        this.data = data;
        this.next = null;
    }


    // method 2: simpler constructor design: have a drawback: not flexible
    //  new Node(value, next node)
    // Node(int data, Node next){
    //     this.data = data;
    //     this.next = next;
    // }
}
public class Basic_Concepts {
    public static void main(String[] args) {

        // create a linked list

        // drawback of this simple structure is that i have to write down nodes backwords. Which is not flexsible, but method 1 of the cromnstructor is more flexible and shpould use that instead of the method 2

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


    }
    
}

