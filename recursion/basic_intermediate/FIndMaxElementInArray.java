package recursion.basic_intermediate;

public class FIndMaxElementInArray {
    static int findMax(int arr[], int i, int max) {
        int n = arr.length - 1;
        if (i > n)
            return max;
        max = Math.max(max, arr[i]);
        return findMax(arr, i + 1, max);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 5, 3, 4 };
        System.out.println(findMax(arr, 0, 0));
    }
}
