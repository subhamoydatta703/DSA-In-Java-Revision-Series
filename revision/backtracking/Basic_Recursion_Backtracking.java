package revision.backtracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic_Recursion_Backtracking {
    // print 1 to n by backtracking

    static void OToNByBackTrack(int  i){
        if(i==1){
            System.out.println(i);
            return;
        }
        OToNByBackTrack(i-1);
        System.out.println(i);
    }
    static int[] arrCreate(int arr[], int n) { 
    for(int i = 0; i < n; i++) { 
        arr[i] = i + 1; 
    } 
    return arr; 
}

    static List<List<Integer>> testCase(int[] arr, List<Integer> curr, List<List<Integer>> res, int idx, int k){
        
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            // System.out.println("basecase hit: "+" res is: "+ res);
            return res;
        }
        if(idx==arr.length){
         
            // System.out.println("basecase hit: "+" res is: "+ res);
            return res;
        }
        // System.out.println("before adding anything to curr: "+ curr);
        // System.out.println("Adding: "+arr[idx]+" to curr");
        if(curr.size()<k){
            // System.out.println(curr.size()+" curr size");
            curr.add(arr[idx]);
            // System.out.println(curr+" added");
            // System.out.println("recursion call for: "+(idx+1));
            testCase(arr, curr, res, idx+1, k);
            // backtrack
            curr.remove(curr.size()-1);
            
            testCase(arr, curr, res, idx+1, k);
            
            
        }
        return res;
    }

        public static List<List<Integer>> combine(int n, int k) {
        int arr[] = new int[n];
        arrCreate(arr, n);
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        return testCase(arr, curr, res, 0, k);

    }
    static List<List<Integer>> testCase2(int[] arr, List<Integer> curr, List<List<Integer>> res, int idx, int t){
        if(t<0){
            return res;
        }
        if(idx==arr.length || t==0){
            res.add(new ArrayList<>(curr));
            System.out.println("basecase hit: "+" res is: "+ res);
            return res;
        }
        System.out.println("before adding anything to curr: "+ curr);
        System.out.println("Adding: "+arr[idx]+" to curr");
        curr.add(arr[idx]);
        System.out.println(curr+" added");
        System.out.println("recursion call for: "+(idx+1));
        testCase2(arr, curr, res, idx+1, t-arr[idx]);
        // backtrack
        
        curr.remove(curr.size()-1);
        
        testCase2(arr, curr, res, idx+1, t);
        return res;
    }


    public static void main(String[] args) {
        // OToNByBackTrack(4);
        int arr[] = {1,2,3}, t =5, n =3;
        int arr2[] = new int[n];
        // System.out.println(testCase(arr, new ArrayList<>(), new ArrayList<>(), 0, 2));
        // arrCreate(arr2, 4);
        System.out.println(combine(n, 2));
        // testCase2(arr, new ArrayList<>(), new ArrayList<>(), 0, t);
    }
}
