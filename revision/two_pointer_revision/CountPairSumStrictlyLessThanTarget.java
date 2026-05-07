package revision.two_pointer_revision;

public class CountPairSumStrictlyLessThanTarget {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length, l = 0, r = n - 1, count = 0, t = 9;
        while (l < r) {
            if ((arr[l] + arr[r]) < t) {
                count += r - l;
                l++;
            } else if ((arr[r] + arr[l]) > t)
                r--;
            else if ((arr[r] + arr[l]) == t)
                r--;

        }
        System.out.println(count);
    }
}
