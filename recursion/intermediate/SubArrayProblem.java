package recursion.intermediate;

public class SubArrayProblem {
    static void subArr(int arr[], int l, int r, int n) {
        if (l > n - 1)
            return;
        if (r < n) {
            System.out.print(arr[r] + " ");
            subArr(arr, l, r + 1, n);
        } else {
            System.out.println();
            subArr(arr, l + 1, l + 1, n);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6 };
        subArr(arr, 0, 0, arr.length);
    }
}
