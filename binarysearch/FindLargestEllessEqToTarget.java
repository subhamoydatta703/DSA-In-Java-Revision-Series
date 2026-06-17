package binarysearch;

public class FindLargestEllessEqToTarget {
    static int laegestElLessEqTarget(int arr[], int t) {

        int n = arr.length, l = 0, r = n - 1, max = Integer.MIN_VALUE;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] <= t) {
                max = Math.max(max, m);
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return (max == Integer.MIN_VALUE) ? -1 : max;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 10, 15, 16, 17 }, t = 20;
        System.out.println(laegestElLessEqTarget(arr, t));
    }
}
