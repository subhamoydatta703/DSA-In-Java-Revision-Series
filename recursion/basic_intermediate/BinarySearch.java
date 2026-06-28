package recursion.basic_intermediate;

public class BinarySearch {
    static int binSearch(int arr[], int s, int e, int t) {
        if (s > e)
            return -1;
        int m = s + (e - s) / 2;
        if (arr[m] == t)
            return m;
        else if (t > arr[m]) {
            return binSearch(arr, m + 1, e, t);
        }
        return binSearch(arr, s, m - 1, t);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 7, 9, 12 }, n = arr.length, t = 7;
        System.out.println(binSearch(arr, 0, n - 1, 7));
    }
}
