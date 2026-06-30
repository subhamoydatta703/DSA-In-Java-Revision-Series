package binarysearch;

public class FindMinInRotatedArrayII {
    static int findMinRotArr(int arr[]) {
        int n = arr.length, l = 0, r = n - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] == arr[l] && arr[m] == arr[r]) {
                l++;
                r--;
            } else if (arr[m] > arr[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return arr[l];
    }

    public static void main(String[] args) {
        int arr[] = { 2,2,2,0,1};
        System.out.println(findMinRotArr(arr));
    }
}
