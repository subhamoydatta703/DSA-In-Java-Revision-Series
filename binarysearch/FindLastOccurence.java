package binarysearch;

public class FindLastOccurence {
    static int FindLastOccurenceOfElement(int arr[], int t) {
        int r = -1, lt = 0, rt = arr.length - 1;

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

        return r;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 8, 8, 10 }, t = 2;
        System.out.println(FindLastOccurenceOfElement(arr, t));
    }
}
