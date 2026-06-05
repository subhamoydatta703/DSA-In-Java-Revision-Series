package revision.sliding_window.fixed_sized_window;

public class FindAvgSubArrOfSizeK {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 6, 4, 8, 5 }, k = 3;
        int n = arr.length, l = 0, r = 0, sum = 0;
        while (r < n) {
            sum += arr[r];
            if ((r - l + 1) == k) {
                float avg = (float) sum / (r - l + 1);
                System.out.printf("%.2f", avg);
                System.out.println();
                sum = sum - arr[l];
                l++;
            }
            r++;
        }
    }
}
