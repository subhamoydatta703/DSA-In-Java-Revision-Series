package recursion.basic_intermediate;

public class CheckingSortedArray {
    static boolean isSortedArr(int arr[], int l) {
        int n = arr.length;
        if (l >= n - 1)
            return true;
        if (arr[l] > arr[l + 1])
            return false;
        return isSortedArr(arr, l + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        System.out.println(isSortedArr(arr, 0));
    }
}
