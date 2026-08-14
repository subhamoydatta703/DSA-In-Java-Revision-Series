package trees;

import trees.BinTreeRepresentation.Node;

public class PostOrderTraversal {

    static void postOrder(Node curr){
        if(curr== null) return;

        postOrder(curr.left);
        postOrder(curr.right);
        System.out.println(curr.val);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        // left node/child of root
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // right node/child of root
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        postOrder(root);
    }
}
