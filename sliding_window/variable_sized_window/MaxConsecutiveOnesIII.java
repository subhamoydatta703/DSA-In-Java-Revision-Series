package sliding_window.variable_sized_window;

public class MaxConsecutiveOnesIII {
    // Find the maximum length subarray containing at most k zeros
    // OR, Given a binary array, find the maximum number of consecutive 1s if you
    // can flip at most k zeros.
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 0, 1, 1, 1, 0, 1, 1 }, k = 2;
        int n = arr.length, l = 0, r = 0, max = 0, countZero = 0;
        while (r < n) {
            if (arr[r] == 0)
                countZero++;
            while (countZero > k) {
                if (arr[l] == 0) {
                    countZero--;
                }
                l++;
            }
            max = Math.max(max, (r - l + 1));
            r++;
        }
        System.out.println(max);
    }

}
