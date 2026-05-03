package revision.two_pointer_revision;

public class FindFrequencyofTargetElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 5, 6, 6, 6, 6, 7, 8, 8, 9, 9 }, target = 9;
        int n = arr.length, l = 0, r = n - 1, freq = 0;
        while (l < r) {
            if ((arr[l] == target) || (arr[r] == target)) {
                freq++;
                l++;
                r--;
            } else if (arr[l] < target)
                l++;
            else
                r--;

        }
        System.out.println(freq);
    }
}
