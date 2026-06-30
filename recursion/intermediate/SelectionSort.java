package recursion.intermediate;

import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSort(int arr[], int i, int n, int maxIdx) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        if (n == 1)
            return arr;
        if (i < n - 1) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
            return selectionSort(arr, i + 1, n, maxIdx);
        }
        int temp = arr[maxIdx];
        arr[maxIdx] = arr[n - 1];
        arr[n - 1] = temp;
        return selectionSort(arr, 0, n - 1, 0);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 1, 2, 5, 8, 6 };
        System.out.print(Arrays.toString(selectionSort(arr, 0, arr.length - 1, 0)));
    }
}
