package sliding_window.fixed_sized_window;

public class MaxSumSubArrOfSizeK {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 1, 3, 2 }, k = 3;
        int n = arr.length, l = 0, r = 0, sum = 0, max = Integer.MIN_VALUE;
        while (r < n) {
            sum += arr[r];
            if ((r - l + 1) == k) {
                max = Math.max(sum, max);
                sum = sum - arr[l];
                l++;
            }
            r++;
        }
        System.out.println(max);
    }
}
