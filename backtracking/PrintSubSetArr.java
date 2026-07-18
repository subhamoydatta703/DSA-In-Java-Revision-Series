package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSetArr {

    static List<List<Integer>> subSetArray(int arr[], List<Integer> curr, List<List<Integer>> res, int i) {
        // base case
        if (i == arr.length) {
            res.add(new ArrayList<>(curr));
            return res;
        }

        // recursion
        curr.add(arr[i]);
        subSetArray(arr, curr, res, i + 1);

        // backtracking
        curr.remove(curr.size() - 1);
        subSetArray(arr, curr, res, i + 1);

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        System.out.println(subSetArray(arr, curr, res, 0));
    }
}
