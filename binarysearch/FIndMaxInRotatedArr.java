package binarysearch;

public class FIndMaxInRotatedArr {
    static int findMaxRotArr(int arr[]) {
        int n = arr.length, l = 0, r = n - 1, max = Integer.MIN_VALUE;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] > arr[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        int maxVal = (l == 0) ? arr[n - 1] : arr[l - 1];
        return maxVal;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 1, 5, 7, 9 };

        System.out.println(findMaxRotArr(arr));

    }
}
