package revision.sliding_window.fixed_sized_window;

public class CountOddNumInWindowOfSizeK {
    static boolean isOdd(int num) {
        if (num % 2 == 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 6, 4, 8, 5 }, k = 3;
        int n = arr.length, l = 0, r = 0, count = 0;
        while (r < n) {
            if (isOdd(arr[r])) {
                count++;
            }
            if ((r - l + 1) == k) {
                System.out.println(count);
                if (isOdd(arr[l])) {
                    count--;
                }
                l++;
            }
            r++;
        }
    }
}
