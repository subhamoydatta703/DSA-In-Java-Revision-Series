package trees;

public class BinTreeRepresentation {
    static class Node {
        int val;
        Node left, right;

        Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

    }
}
