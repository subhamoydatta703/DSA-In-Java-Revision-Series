package revision.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildAndUnbuildAPath {
    static int[] createArr(int n){
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= i+1;
        }
        return arr;
    }
    static List<List<Integer>> buildUnbuildPath(int arr[], List<Integer> curr, List<List<Integer>> res, int k, int idx){
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            return res;
        }

        if(idx==arr.length){
            return res;
        }

        curr.add(arr[idx]);
        buildUnbuildPath(arr, curr, res, k, idx+1);
        curr.remove(curr.size()-1);
        buildUnbuildPath(arr, curr, res, k, idx+1);
        return res;
    }
    public static void main(String[] args) {
        int newArr[] = createArr(3), k =2;
        // System.out.println(Arrays.toString(newArr));
        System.out.println(buildUnbuildPath(newArr, new ArrayList<>(), new ArrayList<>(), k, 0));
    }
}
