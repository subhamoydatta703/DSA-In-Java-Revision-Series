package recursion.basic_intermediate;

public class SumOfArrayElements {
    static int sumArrElements(int arr[], int s, int sum) {
        int n = arr.length - 1;
        if (s > n)
            return sum;
        sum += arr[s];
        return sumArrElements(arr, s + 1, sum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sumArrElements(arr, 0, 0));
    }
}
