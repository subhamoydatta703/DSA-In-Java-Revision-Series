package revision.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumII_Revision {
    static List<List<Integer>> comSumWithoutDup(int arr[], List<Integer> curr, List<List<Integer>> res, int t, int sum, int idx){
        if(sum==t){
            res.add(new ArrayList<>(curr));
            return res;
        }
        if(idx==arr.length || sum>t){
            return res;
        }
        curr.add(arr[idx]);

        comSumWithoutDup(arr, curr, res, t, sum+arr[idx], idx+1);

        curr.remove(curr.size()-1);
        int next =idx+1;
        while(next<arr.length && arr[next]==arr[idx]){
            next++;
        }

        comSumWithoutDup(arr, curr, res, t, sum, next);

        return res;

    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3}, t =3;
        System.out.println(comSumWithoutDup(arr, new ArrayList<>(), new ArrayList<>(), t, 0, 0));
    }
}
