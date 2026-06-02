package sliding_window.fixed_sized_window;

public class FindSumOfAllSubArrSizeK {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 }, k = 3;
        int n = arr.length, l = 0, r = 0, sum = 0;
        while (r < n) {
            sum += arr[r];
            if ((r - l + 1) == k) {
                System.out.println(sum);
                sum = sum - arr[l];
                l++;
            }
            r++;
        }
    }
}
