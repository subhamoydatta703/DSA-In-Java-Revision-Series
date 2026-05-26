package revision.two_pointer_revision;

import java.util.Arrays;

public class Four_Sum_Closest {
    public static void main(String[] args) {
        // int arr[] = { -3, -1, 0, 2, 4, 6, 8 }, t = 11;
        // int arr[] = { -5, -2, 0, 3, 7, 9, 12 }, t = 20;
        // int arr[] = { -5, -2, 0, 3, 7, 9, 12 }, t = 21;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }, t = 24;
        int n = arr.length, min = Integer.MAX_VALUE, thisSum = 0;
        Arrays.sort(arr);
        for (int k = 0; k < n-3; k++) {
            for (int j = k + 1; j < n-2; j++) {
                int l = j + 1, r = n - 1;
                while (l < r) {
                    int sum = arr[k] + arr[j] + arr[l] + arr[r];
                    int diff = Math.abs(sum - t);
                    if (diff < min) {
                        min = diff;
                        thisSum = sum;
                    }
                    if (sum < t)
                        l++;
                    else if (sum > t)
                        r--;
                    else {
                        System.out.println(thisSum);
                        return;
                    }
                }
            }
        }
        System.out.println(thisSum);
    }
}
