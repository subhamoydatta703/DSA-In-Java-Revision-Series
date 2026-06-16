package binarysearch;

public class SearchInsertPosition {
    static int searchInsertPos(int arr[], int t) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == t) {
                return m;
            } else if (arr[m] < t) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 }, t = 4;
        System.out.println(searchInsertPos(arr, t));
    }
}
