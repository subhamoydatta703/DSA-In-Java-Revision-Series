package backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationsProblem {
    static int[] arrCreate(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    static List<List<Integer>> testCase(int[] arr, List<Integer> curr, List<List<Integer>> res, int idx, int k) {

        if (curr.size() == k) {
            res.add(new ArrayList<>(curr));

            return res;
        }
        if (idx == arr.length) {

            return res;
        }

        if (curr.size() < k) {

            curr.add(arr[idx]);

            testCase(arr, curr, res, idx + 1, k);
            // backtrack
            curr.remove(curr.size() - 1);

            testCase(arr, curr, res, idx + 1, k);

        }
        return res;
    }

    static List<List<Integer>> combine(int n, int k) {
        int arr[] = new int[n];
        arrCreate(arr, n);
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        return testCase(arr, curr, res, 0, k);
    }

    public static void main(String[] args) {
        System.out.println(combine(3, 2));
    }
}
