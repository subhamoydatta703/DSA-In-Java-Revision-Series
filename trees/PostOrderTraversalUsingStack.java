package trees;


import java.util.ArrayDeque;
import java.util.Deque;

import trees.BinTreeRepresentation.Node;
public class PostOrderTraversalUsingStack {


    // 2 stack approach
    static void postOrderTwoStack(Node root){
        if(root == null) return;
        Deque<Node> st1 = new ArrayDeque<>();
        Deque<Node> st2 = new ArrayDeque<>();


        st1.push(root);

        while(!st1.isEmpty()){
            
            Node curr = st1.pop();
            st2.push(curr);

            if(curr.left != null){
                st1.push(curr.left);
                
            }
            if(curr.right != null){
                st1.push(curr.right);
                
            }
        }

        while(!st2.isEmpty()){

            Node curr = st2.pop();

            System.out.println(curr.val);
        }

    }


    // single stack approach

    static void postOrderOneStack(Node root){
        if(root == null) return;
        Deque<Node> st = new ArrayDeque<>();
        Node lastVisited = null;

        while(root != null || !st.isEmpty()){
            while(root != null){
                st.push(root);
                root = root.left;
            }

            Node peek = st.peek();

            if(peek.right != null && lastVisited != peek.right){
                root = peek.right;
            }
            else{
                System.out.println(peek.val);
                lastVisited = st.pop();
            }
        }

    }


        public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        // left node/child of root
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // right node/child of root
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        // postOrderTwoStack(root);
        postOrderOneStack(root);
    }
}
