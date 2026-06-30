package recursion.basic_intermediate;

import java.util.Arrays;

public class BubbleSort {
    static int[] bubbleSort(int arr[], int i, int n) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        if (n == 1)
            return arr;
        if (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
            return bubbleSort(arr, i + 1, n);
        } else {
            System.out.println();
            return bubbleSort(arr, 0, n - 1);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2, 7, 3, 5, 6, 1, 9 };
        // bubbleSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(bubbleSort(arr, 0, arr.length - 1)));
    }
}
