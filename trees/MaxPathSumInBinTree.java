package trees;

import trees.BinTreeRepresentation.Node;
public class MaxPathSumInBinTree {
    static int maxPathDown(Node root, int[] maxVal){

        if(root==null) return 0;

        int lt = Math.max(0,maxPathDown(root.left, maxVal));
        int rt = Math.max(0,maxPathDown(root.right, maxVal));

        int curr = root.val + lt+rt;

        maxVal[0] = Math.max(maxVal[0], curr);

        return Math.max(rt, lt) + root.val;


    }

    static int maxPathSum(Node root){
        int maxVal[] = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxVal);
        return maxVal[0];
    }
}
