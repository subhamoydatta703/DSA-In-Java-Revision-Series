package revision.binarysearch;

public class SearchInsertPosition {
    static int findInsertPos(int arr[], int t) {
        int n = arr.length, l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (t <= arr[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 }, t = 4;

        System.out.println(findInsertPos(arr, t));

    }
}
