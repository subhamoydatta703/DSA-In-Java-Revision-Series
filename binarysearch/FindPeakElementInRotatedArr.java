package binarysearch;

// 1. if rotated sorted array -> peak = min -1 th element, 
// 2. if not roated sorted array= peak = arr.length -1 th element
public class FindPeakElementInRotatedArr {
    static int findPeakIdx(int arr[]) {
        int n = arr.length, l = 0, r = n - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] > arr[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        int peakIdx = (l == 0) ? n - 1 : l - 1;
        return peakIdx;

    }

    public static void main(String[] args) {
        // int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(findPeakIdx(arr));
    }
}
