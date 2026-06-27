package revision.binarysearch;

public class FindMinElementGtraterEqualToTarget {
    static int findMinElGreaterEqToTarget(int arr[], int t) {
        int n = arr.length, s = 0, e = n - 1, min = Integer.MAX_VALUE;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] >= t) {
                min = Math.min(min, m);
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        return (min == Integer.MAX_VALUE) ? -1 : arr[min];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 11 }, t = 8;

        System.out.println(findMinElGreaterEqToTarget(arr, t));

    }
}
