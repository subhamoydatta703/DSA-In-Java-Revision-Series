package trees;

public class BinTreeRepresentation {
    public static class Node {
       public int val;
        public Node left, right;

        public Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

    }
}
