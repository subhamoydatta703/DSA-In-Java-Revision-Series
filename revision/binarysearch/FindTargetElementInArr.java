package revision.binarysearch;

public class FindTargetElementInArr {
    static int binSearchForTargetElement(int arr[], int target) {
        int n = arr.length, l = 0, r = n - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target) {
                return m;
            } else if (arr[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 9 }, t = 5;
        System.out.println(binSearchForTargetElement(arr, t));
    }
}
