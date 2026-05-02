package revision.two_pointer_revision;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 3, 12, 0 };
        int n = arr.length, l = 0, r = l + 1;
        while (r < n) {
            if (arr[r] != 0) {
                int t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
                l++;
                r++;
            } else {
                r++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
