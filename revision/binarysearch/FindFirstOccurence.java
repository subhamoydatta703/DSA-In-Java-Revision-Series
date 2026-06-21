package revision.binarysearch;

public class FindFirstOccurence {
    static int firstOccurence(int arr[], int t) {
        int n = arr.length, l = 0, r = n - 1, idx = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == t) {
                idx = m;
                r = m - 1;
            } else if (arr[m] > t) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return (idx == -1) ? -1 : idx;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 8, 8, 10 }, t = 2;

        System.out.println(firstOccurence(arr, t));
    }
}
