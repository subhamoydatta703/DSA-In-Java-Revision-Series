package revision.two_pointer_revision;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[]={-4, -1, -1, 0, 1, 2};
        int n =arr.length, k = n-1;
        Arrays.sort(arr);
        while(k>=2){
            int l = 0, r = k-1;
            while(l<r){
            int sum = arr[l]+arr[r];
            if(sum==(-arr[k])){
                System.out.println(arr[l]+" "+arr[r]+" "+arr[k]);
                l++;
                r--;
                // duplicate check condition for l and r
                while(l<r && arr[l] == arr[l-1]) l++;
                while(l<r && arr[r] == arr[r+1]) r--;
            }else if(sum<(-arr[k])){
                l++;
            }else{r--;}}
            k--;
            // duplicate check condition for k
            while(k>=2 && arr[k]==arr[k+1]) k--;
        }
    }
}
