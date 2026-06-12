package prefixsum;

public class MaxSubArrSumOfWindowSizeK {
    public static void main(String[] args) {
        int arr[]={2,1,5,1,3,2}, k =3;
        int n = arr.length, l=0, r=0, cumSum=0, max=0;
        while(r<n){
            cumSum += arr[r];
            if((r-l+1)==k){
                max = Math.max(max, cumSum);
                cumSum= cumSum - arr[l];
                l++;
            }
            r++;
        }
        System.out.println(max);
    }
}
