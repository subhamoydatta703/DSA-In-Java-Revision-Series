package revision.binarysearch;

public class FindTargetElementInRotatedArr {
    static int searchInRotArr(int arr[], int t) {
        int n = arr.length, s = 0, e = n - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == t) {
                return m;
            } else if (arr[s] <= arr[m]) {
                if (t >= arr[s] && t < arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (t > arr[m] && t <= arr[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = { 4, 5, 6, 7, 0, 1, 2 }, t = 0;
        int arr[] = { 4, 5, 1, 2, 3 }, t = 7;
        System.out.println(searchInRotArr(arr, t));

    }
}
