package revision.sliding_window.variable_sized_window;

public class SmallestSubArrWithSumGreaterEqToK {
    public static void main(String[] args) {
        int arr[]={2,1,5,2,3,2}, k =7;
        int n =arr.length, l=0, r=0, sum =0, min=Integer.MAX_VALUE;
        while(r<n){
            sum += arr[r];
            while(sum>=k){
                min = Math.min(min, (r-l+1));
                sum = sum -arr[l];
                l++;
            }
            r++;
        }
        System.out.println(min);
    }
}
