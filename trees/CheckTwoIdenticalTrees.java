package trees;


import trees.BinTreeRepresentation.Node;

public class CheckTwoIdenticalTrees {
    // static List<Integer> preOrderStack(Node p, List<Integer> res) {
    // Deque<Node> st = new ArrayDeque<>();
    // if (p == null)
    // return res;

    // st.push(p);

    // while (!st.isEmpty()) {
    // Node curr = st.pop();
    // // System.out.print(curr.val + " ");
    // res.add(curr.val);

    // if (curr.right != null) {
    // st.push(curr.right);
    // }
    // if (curr.left != null) {
    // st.push(curr.left);
    // }
    // }
    // return res;
    // }

    static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
