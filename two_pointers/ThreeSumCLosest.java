package two_pointers;

import java.util.Arrays;

// import java.;

public class ThreeSumCLosest {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 8 }, t = 10;
        int n = arr.length, k = n - 1, min = Integer.MAX_VALUE, thisSum = 0;
        Arrays.sort(arr);
        while (k >= 2) {
            int l = 0, r = k - 1;
            while (l < r) {
                int lt = arr[l], rt = arr[r], kt = arr[k];
                int sum = lt + rt + kt;
                int diff = Math.abs(sum - t);
                if (min > diff) {
                    min = diff;
                    thisSum = sum;
                }

                if (sum > t) {
                    r--;
                } else if (sum < t)
                    l++;
                else {
                    l++;
                    r--;
                }
            }
            k--;

        }
        System.out.println(thisSum);
    }
}
