package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsWithDuplicates {
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
        int next = i + 1;
        while (next < arr.length && arr[next] == arr[i]) {
            next++;
        }
        subSetArray(arr, curr, res, next);

        return res;
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        return subSetArray(nums, new ArrayList<>(), new ArrayList<>(), 0);
    }
    public static void main(String[] args) {
        
    }
}
