package revision.two_pointer_revision;

public class RemoveinstofSPecificValandReturnNewLen {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,5,5,6,7,8};
        int n = arr.length, l=0, r =0, val = 5;
       
        while(r<n){
            if(arr[r] !=val){
                arr[l]=arr[r];
                l++;
            }
            r++;
        }
    for(int num: arr){
        System.out.print(num+" ");
    }
    
    
}
}
