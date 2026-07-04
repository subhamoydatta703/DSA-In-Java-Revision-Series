package sliding_window.fixed_sized_window;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMaxOfEveryWindowOfSizeK {

    static int[] maxEachWindow(int arr[], int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length, l = 0, r = 0, max = Integer.MIN_VALUE;
        if (n == 0 || k == 0)
            return new int[0];
        if (k == 1)
            return arr.clone();

        while (r < n) {
            max = Math.max(max, arr[r]);
            if ((r - l + 1) == k) {
                list.add(max);
                l++;

                if(l<=r){
                    max = Integer.MIN_VALUE;
                    for (int i = l; i <= r; i++) {
                        max = Math.max(max, arr[i]);
                    }

                }
            }
            r++;
        }
        int[] primitiveArray = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return primitiveArray;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 }, k = 3;
        // int arr[] = { 1}, k = 1;
        // int n = arr.length, l = 0, r = 0, max = Integer.MIN_VALUE;
        // while (r < n) {
        // max = Math.max(max, arr[r]);
        // if ((r - l + 1) == k) {
        // System.out.println(max);
        // l++;
        // for (int i = l; i <= r; i++) {
        // max = Math.max(max, arr[i]);
        // }
        // }
        // r++;
        // }
        System.out.println(Arrays.toString(maxEachWindow(arr, k)));
    }

}
