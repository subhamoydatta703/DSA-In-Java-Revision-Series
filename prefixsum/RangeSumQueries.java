package prefixsum;

public class RangeSumQueries {
    static void rangeSumQueriesValues(int[] arr, int s, int e) {
        int n = arr.length;
        int prefixArr[] = new int[n], cumSum = 0;
        for (int i = 0; i < n; i++) {
            cumSum += arr[i];
            prefixArr[i] = cumSum;
        }
        int endVal = prefixArr[e];
        int startVal = (s == 0) ? 0 : prefixArr[s - 1];
        System.out.println(endVal - startVal);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rangeSumQueriesValues(arr, 2, 4);
        rangeSumQueriesValues(arr, 1, 3);

    }
}