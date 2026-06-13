package revision.prefixsum;

public class RangeSumQueries {
    static int rangeSumQueries(int[] arr, int s, int e) {
        int cumSum = 0, n = arr.length;
        int prefixArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            cumSum += arr[i];
            prefixArr[i] = cumSum;
        }
        int left = (s > 0) ? prefixArr[s - 1] : 0;
        int right = prefixArr[e];
        return (right - left);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.print(rangeSumQueries(arr, 1, 3));

    }
}
