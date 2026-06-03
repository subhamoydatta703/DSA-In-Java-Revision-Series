package sliding_window.variable_sized_window;

public class SmallestSubArrWithSumGreaterEqualToK {
    public static void main(String[] args) {
          int arr[]={1,2,1,0,1,1,0}, k =4;
        int n = arr.length, l =0, r=0, sum =0, minLen = Integer.MAX_VALUE;
        while(r<n){
            sum += arr[r];
            while(sum >= k){
                minLen = Math.min((r-l+1), minLen);
                sum -= arr[l];
                l++;
                
            }
            r++;
        }
        System.out.println(minLen);
    }
}