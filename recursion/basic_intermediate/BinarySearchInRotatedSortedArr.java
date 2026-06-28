package recursion.basic_intermediate;

public class BinarySearchInRotatedSortedArr {

    static int rotBinSearch(int arr[], int s, int e, int t) {
        if (s > e)
            return -1;
        int m = s + (e - s) / 2;
        if (arr[m] == t) {
            return m;
        } else if (arr[s] <= arr[m]) {
            if (t >= arr[s] && t < arr[m]) {
                return rotBinSearch(arr, s, m - 1, t);
            } else {
                return rotBinSearch(arr, m + 1, e, t);
            }
        } else {
            if (t > arr[m] && t <= arr[e]) {
                return rotBinSearch(arr, m + 1, e, t);
            } else {
                return rotBinSearch(arr, s, m - 1, t);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 }, t = 5, n = arr.length;
        System.out.println(rotBinSearch(arr, 0, n - 1, t));
    }
}
