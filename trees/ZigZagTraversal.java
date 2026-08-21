package trees;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

import trees.BinTreeRepresentation.Node;
public class ZigZagTraversal {
    static List<List<Integer>> zigzagTraversal(Node root, List<List<Integer>> res){
        if(root == null) return res;

        Deque<Node> q = new ArrayDeque<>();
        boolean rev = false;
        q.add(root);
        while(!q.isEmpty()){
            int sz = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<sz; i++){
                Node curr = q.poll();
            level.add(curr.val);
            
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            if(rev){
                Collections.reverse(level);
            }

            res.add(level);
            rev = !rev;
            }
            return res;

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

        System.out.println(zigzagTraversal(root, new ArrayList<>()));
    }
}
