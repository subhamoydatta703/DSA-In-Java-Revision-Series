package two_pointers;

public class MovesOnesToTHeEndAndZerosToTheFront {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1,0};
        // int arr[]={0,1,0,1};
         int n = arr.length, l =0, r =l;
         while(r<n){
            if(arr[r]==0){
                int t = arr[l];
                arr[l]=arr[r];
                arr[r]=t;
                l++;
                r++;
            }else{
                r++;
            }
         }
         for(int num:arr){
            System.out.print(num+" ");
         }
    }
}
