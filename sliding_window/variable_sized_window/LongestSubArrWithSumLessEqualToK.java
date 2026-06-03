package sliding_window.variable_sized_window;

public class LongestSubArrWithSumLessEqualToK {
    public static void main(String[] args) {
        int arr[]={1,2,1,0,1,1,0}, k =4;
        int n = arr.length, l =0, r=0, sum =0, maxLen = 0;
        while(r<n){
            sum += arr[r];
            while(sum>k){
                sum -= arr[l];
                l++;
            }
            maxLen = Math.max(maxLen, (r-l+1));
            r++;
        }
        System.out.println(maxLen);
    }
}
