package trees;

import java.util.ArrayDeque;
import java.util.Deque;

import trees.BinTreeRepresentation.Node;

public class InOrderTraversalUsingStack {

    static void inOrderStack(Node root) {
        Deque<Node> st = new ArrayDeque<>();

        Node curr = root;

        while (curr != null || !st.isEmpty()) {

            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();

            System.out.print(curr.val + " ");

            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        // left node/child of root
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        inOrderStack(root);
    }
}
