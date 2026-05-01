package two_pointers;

public class MinDifferenceofTwoElements {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 10, 15 };
        int n = arr.length, l = 0, r = l + 1, min = Integer.MAX_VALUE;
        while (r < n) {
            int sub = arr[r] - arr[l];

            if (sub < min) {
                min = sub;
            }
            l++;
            r++;
        }
        System.out.println(min);

    }
}
