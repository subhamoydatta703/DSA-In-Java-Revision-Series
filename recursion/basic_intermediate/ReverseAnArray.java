package recursion.basic_intermediate;

import java.util.Arrays;

public class ReverseAnArray {
    static int[] revArr(int arr[], int l, int r) {
        if (l >= r) {
            return arr;
        }
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;

        return revArr(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length, l = 0, r = n - 1;
        System.out.println(Arrays.toString(revArr(arr, l, r)));
    }
}
