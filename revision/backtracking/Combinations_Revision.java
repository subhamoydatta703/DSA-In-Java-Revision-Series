package revision.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations_Revision {

    static List<List<Integer>> combine(int arr[], List<Integer> curr, List<List<Integer>> res, int idx) {
        if (idx == arr.length) {
            res.add(new ArrayList<>(curr));
            return res;
        }

        curr.add(arr[idx]);
        combine(arr, curr, res, idx + 1);
        curr.remove(curr.size() - 1);
        combine(arr, curr, res, idx + 1);
        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        System.out.println(combine(arr, new ArrayList<>(), new ArrayList<>(), 0));
    }
}
