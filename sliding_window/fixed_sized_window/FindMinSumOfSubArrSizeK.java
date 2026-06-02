package sliding_window.fixed_sized_window;

public class FindMinSumOfSubArrSizeK {
    public static void main(String[] args) {
        int arr[]={3, 1, 4, 1, 5, 9, 2}, k =3;
        int n = arr.length, l=0, r=0, sum =0, min = Integer.MAX_VALUE;
        while(r<n){
            sum += arr[r];
            if((r-l+1)==k){
                min = Math.min(min, sum);
                sum = sum - arr[l];
                l++;
            }
            r++;
        }
        System.out.println(min);
    }
    
}
