package binarysearch;

public class FindFirstOccurence {
    static int FindFirstOccurenceOfElement(int arr[], int t) {
        int s = 0, e = arr.length - 1, l = -1;
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
        return (l == -1) ? -1 : l;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 8, 8, 10 }, t = 8;
        System.out.println(FindFirstOccurenceOfElement(arr, t));
    }

}
