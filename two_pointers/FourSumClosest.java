package two_pointers;

import java.util.Arrays;

public class FourSumClosest {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 7, 10, 15 }, t = 35;
        int n = arr.length, thisVal = 0, min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int k = 0; k < n; k++) {
            for (int j = k + 1; k < n; k++) {
                int l = j + 1, r = n - 1;
                while (l < r) {
                    int sum = arr[l] + arr[r] + arr[j] + arr[k];
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
                        System.out.println(thisVal);
                        return;
                    }
                }

            }
        }

        System.out.println(thisVal);
    }
}
