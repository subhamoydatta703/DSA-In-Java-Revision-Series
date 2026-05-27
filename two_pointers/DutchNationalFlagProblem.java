package two_pointers;

public class DutchNationalFlagProblem {
    static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void main(String[] args) {
        // int arr[]= {2,0,2,1,1,0};
        int arr[] = { 1, 2, 0, 2, 1, 0, 1 };
        int n = arr.length, l = 0, m = 0, r = n - 1;
        if (n == 1) {
            System.out.println(arr[0]);
            return;

        }
        while (m <= r) {
            if (arr[m] == 0) {
                swap(arr, m, l);
                m++;
                l++;
            } else if(arr[m]==2) {
                swap(arr, m, r);
                r--;
            }else if(arr[m]==1) m++;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
