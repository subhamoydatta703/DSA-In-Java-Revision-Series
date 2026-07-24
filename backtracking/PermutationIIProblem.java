package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationIIProblem {
    static List<List<Integer>> permutationArrProb2(int arr[], boolean used[], List<Integer> curr, List<List<Integer>> res) {

        if (arr.length == curr.size()) {
            res.add(new ArrayList<>(curr));
            return res;
        }
        int i = 0;
        while (i < arr.length) {
            if (used[i]) {
                i++;
                continue;
            }
            if (i > 0 && arr[i] == arr[i - 1] && used[i - 1] == false) {
                i++;
                continue;
            }

            used[i] = true;
            curr.add(arr[i]);
            permutationArrProb2(arr, used, curr, res);
            curr.remove(curr.size() - 1);
            used[i] = false;
            i++;
        }
        return res;
    }

    static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        return permutationArrProb2(nums, new boolean[nums.length], new ArrayList<>(), new ArrayList<>());
    }

    public static void main(String[] args) {

    }
}
