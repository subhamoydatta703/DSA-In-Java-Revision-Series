package sliding_window.variable_sized_window;

public class LongestSubArrSumEqToK {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1}, k=6;
        int n =arr.length, l=0, r=0, sum=0, max=0;
        while(r<n){
            sum += arr[r];
            while(sum>k){
                sum = sum-arr[l];
                l++;
            }
            if(sum==k){
                max = Math.max((r-l+1), max);
            }
            r++;
        }
        System.out.println(max);
    }
}
