package two_pointers;

import java.util.HashMap;

public class FindPythagorianTriplet {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 12, 13 };
        int n = arr.length;
        boolean flag = false;
        int k = n - 1;
        while (k >= 2) {
            int l = 0, r = k - 1;
            while (l < r) {
                int lt = arr[l] * arr[l], rt = arr[r] * arr[r];
                if ((lt + rt) == (arr[k] * arr[k])) {
                    System.out.println(arr[l] + " " + arr[r] + " " + arr[k]);
                    flag = true;
                    l++;
                    r--;
                } else if ((lt + rt) < (arr[k] * arr[k])) {
                    l++;
                } else{
                    r--;
                }
            }
            k--;
        }
        if (!flag) {
            System.out.println("Not find");
        }
    }
}
