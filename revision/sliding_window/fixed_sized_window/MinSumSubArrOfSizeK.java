package revision.sliding_window.fixed_sized_window;

public class MinSumSubArrOfSizeK {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 6, 4, 8, 5 }, k = 3;
        int n = arr.length, l =0, r =0, sum =0, min =Integer.MAX_VALUE;
        while(r<n){
            sum += arr[r];
            if((r-l+1)==k){
                min = Math.min(sum, min);
                sum = sum - arr[l];
                l++;
            }
            r++;
        }
        System.out.println(min);
    }
}
