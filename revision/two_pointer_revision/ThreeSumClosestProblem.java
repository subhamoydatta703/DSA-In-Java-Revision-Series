package revision.two_pointer_revision;

import java.util.Arrays;

public class ThreeSumClosestProblem {
    public static void main(String[] args) {
        int arr[] = { -7, -3, 2, 5, 8 }, t = 4;
        int n = arr.length, k = n - 1, min = Integer.MAX_VALUE, thisVal = 0;
        Arrays.sort(arr);
        while (k >= 2) {
            int l = 0, r = k - 1;
            while (l < r) {
                int sum = arr[l] + arr[r] + arr[k];
                int diff = Math.abs(sum - t);
                if (diff < min) {
                    min = diff;
                    thisVal = sum;
                }
                if (sum < t)
                    l++;
                else if (sum > t)
                    r--;
                else {
                    l++;
                    r--;
                }
            }
            k--;
        }
        System.out.println(thisVal);
    }
}
