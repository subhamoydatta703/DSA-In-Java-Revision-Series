package recursion.intermediate;

import java.util.Arrays;

public class QuickSort {
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int findPivotIdx(int arr[], int l, int h) {
        int pivot = arr[h], i = l - 1, j = l;
        while (j < h) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        swap(arr, i + 1, h);
        return i + 1;
    }

    static int[] quickSort(int arr[], int l, int h) {
        if (l >= h)
            return arr;
        int pivotIdx = findPivotIdx(arr, l, h);
        quickSort(arr, l, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, h);
        return arr;
    }

    public static void main(String[] args) {
        // int[] arr = {8, 3, 4, 1, 7};
        // int[] arr = {-3, 10, 0, -8, 5, -1};
        int[] arr = { 5, 2, 8, 2, 9, 1, 5, 3 };
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
    }
}
