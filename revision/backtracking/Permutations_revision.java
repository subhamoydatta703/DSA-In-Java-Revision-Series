package revision.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations_Revision {
    static List<List<Integer>> permute(int arr[], boolean[] used, List<Integer> curr, List<List<Integer>> res,
            int idx) {
        if (curr.size() == arr.length) {
            res.add(new ArrayList<>(curr));
            return res;
        }

        if (idx == arr.length) {
            return res;
        }
        int i = 0;
        while (i < arr.length) {
            if (used[i]) {
                i++;
                continue;
            }

            used[i] = true;
            curr.add(arr[i]);
            permute(arr, used, curr, res, idx + 1);

            curr.remove(curr.size() - 1);
            permute(arr, used, curr, res, idx + 1);
            used[i] = false;
            i++;
        }

        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        boolean used[] = new boolean[arr.length];
        System.out.println(permute(arr, used, new ArrayList<>(), new ArrayList<>(), 0));

    }
}
