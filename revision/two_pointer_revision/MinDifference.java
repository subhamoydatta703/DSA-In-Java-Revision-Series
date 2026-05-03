package revision.two_pointer_revision;

public class MinDifference {
    public static void main(String[] args) {
        // int arr[] ={5,5,5,5};
        int arr[] ={1, 2};
        int n=arr.length, l=0, r=l+1, min = Integer.MAX_VALUE;
        while(r<n){
            int sub = arr[r]-arr[l];
            if(sub<min) min = sub;
            else if(arr[l]==arr[r]){
                l++;
                r++;
                continue;
            }
            l++;
            r++;
        }
        System.out.println("Min difference: "+min);
    }
}
