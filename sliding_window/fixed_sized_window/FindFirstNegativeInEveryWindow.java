package sliding_window.fixed_sized_window;

public class FindFirstNegativeInEveryWindow {
    public static void main(String[] args) {
        // int arr[]= {-3, -1, 2, -4, 5, -2, 8}, k =3;
        int arr[] = { 1, 2, 3, 4, 5 }, k = 3;
        int n = arr.length, l = 0, r = 0;
        boolean flag = false;
        while (r < n) {
            if ((r - l + 1) == k) {
                int i = l;
                while (i <= r) {
                    if (arr[i] < 0) {
                        flag = true;
                        System.out.println(arr[i]);
                        i++;
                        break;
                    } else {
                        i++;
                    }

                }
                l++;
            }
            r++;
        }
        if (!flag) {
            System.out.println("No negative values in the whole array");
        }
    }
}
