package two_pointers;

public class AllPairsSmallerisDoublethanLarger {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 2, 4 };
        // int arr[] = { 1, 3, 6 };
        int arr[] = { 1, 2, 3, 6 };

        int n = arr.length, l = 0, r = l + 1;
        while (r < n) {
            if (arr[l] == arr[r]) {
                r++;
                continue;
            }
            if ((2 * arr[l]) == arr[r]) {
                System.out.println(arr[l] + " " + arr[r]);
                l++;
                r++;
            } else if ((2 * arr[l]) > arr[r]) {
                r++;
            } else if ((2 * arr[l]) < arr[r]) {
                l++;
            }
        }
    }
}
