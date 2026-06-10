package revision.sliding_window.variable_sized_window;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 0, 1, 1, 1, 0, 1, 1 }, k = 2;
        int n = arr.length, l = 0, r = 0, count = 0, max = 0;
        while (r < n) {
            if (arr[r] == 0) {
                count++;
            }
            while (count > k) {
                if (arr[l] == 0) {
                    count--;
                }
                l++;
            }
            max = Math.max(max, (r - l + 1));
            r++;
        }
        System.out.println(max);

    }
}
