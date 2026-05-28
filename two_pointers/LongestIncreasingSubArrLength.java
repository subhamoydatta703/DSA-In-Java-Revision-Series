package two_pointers;

public class LongestIncreasingSubArrLength {
    public static void main(String[] args) {
        // int arr[] = { 2, 1, 4, 7, 3, 2, 5 };
        // int arr[] = { 1, 2, 3, 4, 5 };
        // int arr[] = {2, 2, 2, 2} ;
        int arr[] = {1, 2, 1, 3} ;
        
        int n = arr.length, l = 0, r = l + 1, len = 1;
        while (r < n) {
            
            if (arr[r] > arr[r - 1]) {
                len = Math.max((r - l + 1), len);
                r++;

            } else {
                l = r;
                r++;
            }
        }
        System.out.println(len);
    }
}
