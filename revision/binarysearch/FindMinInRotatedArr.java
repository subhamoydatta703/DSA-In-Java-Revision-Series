package revision.binarysearch;

public class FindMinInRotatedArr {
    static int findMinInRitArr(int arr[]) {
        int n = arr.length, s = 0, e = n - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (arr[m] > arr[e]) {
                s = m + 1;
            } else {
                e = m;
            }

        }
        return arr[s];
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 1, 2, 3 };

        System.out.println(findMinInRitArr(arr));

    }
}
