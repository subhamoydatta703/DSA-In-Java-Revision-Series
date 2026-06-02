package sliding_window.fixed_sized_window;

public class FindCountOfSubArrSumEqualsToTarget {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 }, k = 3, target = 6;
        int n = arr.length, l = 0, r = 0, sum = 0, count = 0;
        while (r < n) {
            sum += arr[r];
            if ((r - l + 1) == k) {
                int currWindowSum = sum;
                if (currWindowSum == target)
                    count++;
                sum = sum - arr[l];
                l++;
            }
            r++;
        }
        System.out.println(count);
    }
}
