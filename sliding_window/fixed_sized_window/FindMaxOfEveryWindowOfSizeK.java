package sliding_window.fixed_sized_window;

public class FindMaxOfEveryWindowOfSizeK {
    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 }, k = 3;
        int n = arr.length, l = 0, r = 0, max = Integer.MIN_VALUE;
        while (r < n) {
            max = Math.max(max, arr[r]);
            if ((r - l + 1) == k) {
                System.out.println(max);
                l++;
                r = l;
                max = Integer.MIN_VALUE;
                max = Math.max(max, arr[r]);
            }
            r++;
        }
    }

}
