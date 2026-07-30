package revision.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static List<List<Integer>> comSum(int arr[], int t, List<Integer> curr, List<List<Integer>> res, int sum, int i) {
        if (sum == t) {
            res.add(new ArrayList<>(curr));
            return res;
        }
        if (sum > t || i==arr.length) {
            return res;
        }
        


        curr.add(arr[i]);
        comSum(arr, t, curr, res, sum + arr[i], i);
        curr.remove(curr.size() - 1);
        comSum(arr, t, curr, res, sum, i + 1);
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 }, t = 3;
        System.out.println(comSum(arr, t, new ArrayList<>(), new ArrayList<>(), 0, 0));

    }

}
