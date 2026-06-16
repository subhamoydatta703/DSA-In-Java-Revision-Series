package binarysearch;

public class FindFirstAndLastOccurance {
    static void FindFirstAndLastOccurenceOfElement(int arr[], int t) {
        int s = 0, e = arr.length - 1, l = -1, r = -1, lt = 0, rt = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == t) {
                l = m;
                e = m - 1;
            }

            else if (arr[m] < t) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        while (lt <= rt) {
            int m = lt + (rt - lt) / 2;
            if (arr[m] == t) {
                lt = m + 1;
                r = m;
            }

            else if (arr[m] < t) {
                lt = m + 1;
            } else {
                rt = m - 1;
            }
        }
        System.out.println(l + " " + r);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 8, 8, 10 }, t = 8;
        FindFirstAndLastOccurenceOfElement(arr, t);
    }
}
