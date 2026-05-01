package two_pointers;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = { -4, -1, -1, 0, 1, 2 }, n = arr.length;
        Arrays.sort(arr);
        int k = n - 1;
        while (k >= 2) {
            int l = 0, r = k - 1;
            while (l < r) {
                int sum = arr[l] + arr[r];
                if (sum == (-arr[k])) {
                    System.out.println(arr[l] + " " + arr[r] + " " + arr[k]);
                    l++;
                    r--;
                } else if (sum < -arr[k]) {
                    l++;
                } else
                    r--;
            }
            k--;
        }
    }
}
