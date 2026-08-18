package trees;
import trees.BinTreeRepresentation.Node;
public class CheckBalancedBinTree {
    static int checkHeight(Node root){
        if(root == null) return 0;

        int lt = checkHeight(root.left);
        int rt = checkHeight(root.right);

        if(lt==-1 || rt == -1){
            return -1;
        }

        if(Math.abs(rt-lt)>1) return -1;

        return 1+ Math.max(lt, rt);
    }

    static boolean checkBalance(Node root){
        if(checkHeight(root)==-1) return false;
        return true;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        // left node/child of root
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);

        System.out.println(checkBalance(root));
    }
}
