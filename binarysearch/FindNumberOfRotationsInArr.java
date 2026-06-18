package binarysearch;

public class FindNumberOfRotationsInArr {
    // the number of rotations = index number of the min element
    static int numOfRot(int arr[]) {
        int n = arr.length, l = 0, r = n - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] > arr[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 0, 1, 2 };
        System.out.println(numOfRot(arr));

    }
}
