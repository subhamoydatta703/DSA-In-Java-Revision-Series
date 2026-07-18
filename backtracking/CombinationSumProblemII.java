package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumProblemII {
    static List<List<Integer>> combinationSumII(int arr[], List<Integer> curr, List<List<Integer>> res,
            int i, int remainingTarget) {

        // base case
        if (remainingTarget == 0) {
            res.add(new ArrayList<>(curr));
            return res;
        }

        if (i == arr.length || remainingTarget < 0) {
            return res;
        }

        // recursion
        curr.add(arr[i]);

        // inclusion
        combinationSumII(arr, curr, res, i + 1, remainingTarget - arr[i]);

        // dupliate check
        curr.remove(curr.size() - 1);

        while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
            i++;
        }
        combinationSumII(arr, curr, res, i + 1, remainingTarget);

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 6, 7 }, t = 6;
        Arrays.sort(arr);
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        System.out.println(combinationSumII(arr, curr, res, 0, t));
    }
}
