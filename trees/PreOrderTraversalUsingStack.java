package trees;

import java.util.ArrayDeque;
import java.util.Deque;

import trees.BinTreeRepresentation.Node;

public class PreOrderTraversalUsingStack {

    static void preOrderStack(Node root) {
        Deque<Node> st = new ArrayDeque<>();
        if (root == null)
            return;

        st.push(root);

        while (!st.isEmpty()) {
            Node curr = st.pop();
            System.out.print(curr.val + " ");

            if (curr.right != null) {
                st.push(curr.right);
            }
            if (curr.left != null) {
                st.push(curr.left);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);

        // left node/child of root
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);

        preOrderStack(root);
    }
}
