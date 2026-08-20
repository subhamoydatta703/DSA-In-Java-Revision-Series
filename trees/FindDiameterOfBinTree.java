package trees;

import trees.BinTreeRepresentation.Node;

public class FindDiameterOfBinTree {

    static int findDM(Node root){
        int dm[] = new int[1];
        getDMByHeight(root, dm);
        return dm[0];
    }

    static int getDMByHeight(Node root, int[] dm){
        if(root== null){
            return 0;
        }
        int lh = getDMByHeight(root.left, dm);
        int rh = getDMByHeight(root.right, dm);

        dm[0]= Math.max(dm[0], rh+lh);
        return 1+ Math.max(lh, rh);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        // left node/child of root
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(findDM(root));
    }
}
