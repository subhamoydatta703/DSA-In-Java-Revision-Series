package backtracking;

public class BackTrackingOnArrays {

    public static void changeArrVal(int arr[], int idx, int val) {
        // base case
        if (idx > arr.length - 1) {
            printArr(arr);
            return;
        }
        // just add values one by one based on idx
        arr[idx] = val;
        changeArrVal(arr, idx + 1, val + 1);
        // backtrack to change values on each idx
        arr[idx] = arr[idx] - 1;
    }

    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArrVal(arr, 0, 1);
        System.out.println();
        printArr(arr);
    }
}
