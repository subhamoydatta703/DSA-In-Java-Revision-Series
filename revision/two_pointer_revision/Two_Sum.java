package revision.two_pointer_revision;

public class Two_Sum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 5, 7, 7, 7, 7, 9 };
        int n = arr.length, l = 0, r = n - 1, t = 14;
        while (l < r) {
            if ((arr[l] + arr[r]) == t) {
                System.out.println(arr[l] + " " + arr[r]);
                l++;
                r--;
                while (l < r && arr[l] == arr[l - 1])
                    l++;
                while (l < r && arr[r] == arr[r + 1])
                    r--;
            } else if ((arr[l] + arr[r]) > t) {
                r--;
            } else {
                l++;
            }
        }
    }
}
