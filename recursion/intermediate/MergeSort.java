package recursion.intermediate;

import java.util.Arrays;

public class MergeSort {
    static int[] mergeSort(int arr[]) {
        if (arr.length <= 1)
            return arr;
        int m = arr.length / 2;

        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, m));
        int right[] = mergeSort(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left, right);

    }

    static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i = 0;
        int l = 0, r = 0;
        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                res[i] = left[l];
                l++;
                i++;
            } else {
                res[i] = right[r];
                r++;
                i++;
            }
        }

        while (l < left.length) {
            res[i] = left[l];
            l++;
            i++;

        }
        while (r < right.length) {
            res[i] = right[r];
            r++;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 1, 3, 6, 2 };
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
