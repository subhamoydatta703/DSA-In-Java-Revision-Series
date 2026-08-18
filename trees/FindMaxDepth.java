package trees;

import trees.BinTreeRepresentation.Node;

public class FindMaxDepth {
    static int maxDepth(Node root) {
        if (root == null)
            return 0;

        int lt = maxDepth(root.left);
        int rt = maxDepth(root.right);
        return 1 + Math.max(lt, rt);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        // left node/child of root
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(maxDepth(root));

    }
}
