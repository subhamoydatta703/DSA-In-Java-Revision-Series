package trees;

import trees.BinTreeRepresentation.Node;

public class InOrderTraversal {

    static void inOrder(Node curr) {
        if (curr == null)
            return;

        inOrder(curr.left);
        System.out.println(curr.val);
        inOrder(curr.right);
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

        inOrder(root);

    }
}
