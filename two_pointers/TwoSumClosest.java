package two_pointers;

import java.util.Arrays;

public class TwoSumClosest {
    public static void main(String[] args) {
        int arr[]={1, 3, 4, 7, 10}, t = 15;
        int n = arr.length, l= 0, r = n-1, thisSum =0, min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        while(l<r){
            int sum = arr[l]+arr[r];
            int diff = Math.abs(sum-t);
            if(diff<min){
                min = diff;
                thisSum=sum;
            }
            if(sum<t)l++;
            else if(sum >t)r--;
            else{l++;
            r--;}
        }
        System.out.println(thisSum);
    }
}
