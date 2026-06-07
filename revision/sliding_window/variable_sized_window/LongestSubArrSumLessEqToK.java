package revision.sliding_window.variable_sized_window;

public class LongestSubArrSumLessEqToK {
public static void main(String[] args) {
    int arr[]={3,1,2,1,4,1,3}, k =6;
    int n = arr.length, l=0, r=0, max=0, sum =0;
    while(r<n){
        sum += arr[r];
        while(sum>k){
            sum = sum - arr[l];
            l++;
        }
        max = Math.max(max, (r-l+1));
        r++;
    }
System.out.println(max);
}

}
