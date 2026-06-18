package binarysearch;

public class FindTargetElementInRotatedArrII {
    static boolean isFindTargetInRotArrII(int arr[], int t) {
        int n = arr.length, l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == t)
                return true;

            else if (arr[m] == arr[l] && arr[m] == arr[r]) {
                l++;
                r--;
            } else if (arr[l] <= arr[m]) {
                if (arr[l] <= t && t < arr[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                if (arr[r] >= t && arr[m] < t) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 3, 2, 3, 3, 3, 3 }, t = 2;
        System.out.println(isFindTargetInRotArrII(arr, t));
    }
}
