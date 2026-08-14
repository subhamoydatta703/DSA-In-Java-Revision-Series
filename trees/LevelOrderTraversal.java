package trees;

import java.util.ArrayDeque;
import java.util.Deque;

import trees.BinTreeRepresentation.Node;

// also called BFS
public class LevelOrderTraversal {

    static void levelOrder(Node root) {
        if (root == null)
            return;

        Deque<Node> queue = new ArrayDeque<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            Node curr = queue.poll();
            System.out.println(curr.val + " ");

            if (curr.left != null) {
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
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
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        levelOrder(root);
    }
}
