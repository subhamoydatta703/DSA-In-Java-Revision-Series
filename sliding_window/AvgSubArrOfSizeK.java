package sliding_window;

public class AvgSubArrOfSizeK {
    static void avg(int total, int num) {
        float val = (float) total / num;
        System.out.printf("%.2f", val);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 6, 4, 8, 5 }, k = 3;
        int n = arr.length, l = 0, r = 0, sum = 0;
        while (r < n) {
            sum += arr[r];
            if ((r - l + 1) == k) {
                avg(sum, k);
                System.out.println();
                sum = sum - arr[l];
                l++;
            }
            r++;
        }

    }
}
