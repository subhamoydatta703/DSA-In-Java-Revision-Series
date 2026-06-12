package prefixsum;

public class FindEquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 2 };
        int n = arr.length;
        int prefixArr[] = new int[n], cumSum = 0;
        for (int i = 0; i < n; i++) {
            cumSum += arr[i];
            prefixArr[i] = cumSum;
        }
        int l = 0;
        while (l <= n-1) {
            int right = prefixArr[n-1] - prefixArr[l];
            int left = (l==0)? 0 : prefixArr[l - 1];
            if (left == right) {
                System.out.println(l);
            }
            l++;
        }

    }
}
