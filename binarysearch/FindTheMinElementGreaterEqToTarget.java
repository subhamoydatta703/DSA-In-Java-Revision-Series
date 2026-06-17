package binarysearch;

public class FindTheMinElementGreaterEqToTarget {
    static int findMinElmGrtEqTgt(int arr[], int t) {
        int n = arr.length, l = 0, r = n - 1, min = Integer.MAX_VALUE;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] >= t) {
                min = Math.min(min, m);
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 3, 5, 7, 9 }, t = 6;
        int arr[] = { 1, 2, 7, 10, 15, 16, 17 }, t = 20;
        System.out.println(findMinElmGrtEqTgt(arr, t));
    }

}
