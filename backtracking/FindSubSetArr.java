package backtracking;

import java.util.ArrayList;
import java.util.List;

public class FindSubSetArr {
    public static List<List<Integer>> subsetArr(int arr[], List<Integer> curr, List<List<Integer>> res, int i) {

        // base case
        if (i == arr.length) {
            res.add(new ArrayList<>(curr));
            return res;
        }

        // yes
        curr.add(arr[i]);
        subsetArr(arr, curr, res, i + 1);
        // no
        curr.remove(curr.size() - 1);
        subsetArr(arr, curr, res, i + 1);

        return res;
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        // function call
        return subsetArr(nums, curr, res, 0);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(subsets(arr));
    }
}
