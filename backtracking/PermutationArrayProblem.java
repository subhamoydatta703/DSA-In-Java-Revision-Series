package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationArrayProblem {
    public static List<List<Integer>> permutationArr(int arr[], boolean used[], List<Integer> curr, List<List<Integer>> res){
        if(arr.length==curr.size()){
            res.add(new ArrayList<>(curr));
            return res;
        }
        int i =0;
        while(i<arr.length){
            if(used[i]){
                i++;
                continue;
            }

            used[i]= true;
            curr.add(arr[i]);
            permutationArr(arr, used, curr, res);
            curr.remove(curr.size()-1);
            used[i] = false;
            i++;
        }
        return res;
    }

    public static List<List<Integer>> permute(int[] nums) {
        return permutationArr(nums, new boolean[nums.length], new ArrayList<>(), new ArrayList<>());
    }

    public static void main(String[] args) {
        
    }
}
