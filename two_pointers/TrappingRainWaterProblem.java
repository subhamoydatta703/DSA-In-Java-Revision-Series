package two_pointers;

public class TrappingRainWaterProblem {
    public static void main(String[] args) {
        // int arr[]={3,0,2};
        // int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = arr.length, l = 0, r = n - 1, rtMax = Integer.MIN_VALUE, ltMax = Integer.MIN_VALUE, sum = 0;
        // brute force: O(n^2)
        // for(int i =0; i<n; i++){
        // int r =n-1;
        // int rtMax=Integer.MIN_VALUE;
        // while(r>i){
        // rtMax = Math.max(rtMax, arr[r]);
        // r--;
        // // System.out.println("r: "+r);
        // }
        // if(i==0){
        // ltMax = 0;
        // }
        // else if(i>0){
        // ltMax = Math.max(arr[i-1], ltMax);
        // }
        // // System.out.println("ltmax & rtmax: "+ltMax+" "+rtMax);
        // int minVal = Math.min(rtMax, ltMax);
        // if(minVal<0){
        // minVal=0;
        // }
        // int water = minVal - arr[i];
        // if(water >0){

        // sum += water;
        // }

        // }
        // 2 pointers: O(n)
        while (l < r) {
            ltMax = Math.max(ltMax, arr[l]);
            rtMax = Math.max(rtMax, arr[r]);
            int minVal = Math.min(rtMax, ltMax);
            if (minVal < 0) {
                minVal = 0;
            }
            int water = 0;
            if (ltMax <= rtMax) {
                water = minVal - arr[l];
                if (water > 0) {

                    sum += water;
                }
                l++;
            } else {
                water = minVal - arr[r];
                if (water > 0) {

                    sum += water;
                }
                r--;
            }
        }
        System.out.println(sum);

    }

}
