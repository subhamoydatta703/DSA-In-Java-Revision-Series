package backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumEqualsToK {
    static List<List<Integer>> subSumEqToTarget(int arr[], List<Integer> curr, List<List<Integer>> res, int idx, int t,
            int sum) {
        if (sum > t) {
            return res;
        }
        if (idx == arr.length && sum != t) {
            return res;
        }
        if (idx == arr.length && sum == t) {
            res.add(new ArrayList<>(curr));
            return res;
        }

        curr.add(arr[idx]);
        subSumEqToTarget(arr, curr, res, idx + 1, t, sum + arr[idx]);

        curr.remove(curr.size() - 1);
        subSumEqToTarget(arr, curr, res, idx + 1, t, sum);
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1 }, k = 2;
        System.out.println(subSumEqToTarget(arr, new ArrayList<>(), new ArrayList<>(), 0, k, 0));
    }
}
