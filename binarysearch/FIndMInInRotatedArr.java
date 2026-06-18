package binarysearch;

public class FIndMInInRotatedArr {
    static int findMinRotArr(int arr[]) {
        int n = arr.length, l = 0, r = n - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] > arr[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return arr[l];
    }

    public static void main(String[] args) {
        int arr[] ={4,5,1,2,3};
        // int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        System.out.println(findMinRotArr(arr));
    }
}
