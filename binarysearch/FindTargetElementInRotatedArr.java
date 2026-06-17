package binarysearch;

public class FindTargetElementInRotatedArr {
    static int findTargetInRotatedArr(int arr[], int t) {
        int n = arr.length, l = 0, r = n - 1;
        while (l <= r) {

            int m = l + (r - l) / 2;
            if (arr[m] == t) {

                return m;
            } else if (arr[l] <= arr[m]) {
                if (t >= arr[l] && t < arr[m]) {
                    r = m - 1;

                } else {
                    l = m + 1;
                }
            } else {
                if (t <= arr[r] && t > arr[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 }, t = 0;
        System.out.println(findTargetInRotatedArr(arr, t));

    }
}
