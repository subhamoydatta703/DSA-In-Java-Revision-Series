package backtracking;

import java.util.ArrayList;
import java.util.List;

public class FindSubSetSumEqToTarget {

    static boolean isSubSetSumEqToTarget(int arr[], List<Integer> curr, int i, int remainingTarget) {
        // int remainingTarget = remainingTarget = arr[i];
        // base case
        if (remainingTarget == 0) {
            return true;
        }

        if (i == arr.length || remainingTarget < 0) {
            return false;
        }

        // recursion
        curr.add(arr[i]);
        // inclusion

        boolean val = isSubSetSumEqToTarget(arr, curr, i + 1, remainingTarget - arr[i]);

        if (val) {
            return true;
        }

        // exclusion
        curr.remove(curr.size() - 1);
        boolean val2 = isSubSetSumEqToTarget(arr, curr, i + 1, remainingTarget);
        if (val2) {
            return true;
        }

        

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 2 }, t = 9;
        List<Integer> curr = new ArrayList<>();
        boolean res = isSubSetSumEqToTarget(arr, curr, 0, t);
        System.out.println(res);

    }

}
