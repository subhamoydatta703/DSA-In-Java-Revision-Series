package revision.two_pointer_revision;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        // int arr[]={0,1,0,3,12};
        int arr[]={0,1,2};
        int n = arr.length, l=0, r = 0;
        while(r<n){
            if(arr[r] != 0){
                int t = arr[l];
                arr[l]=arr[r];
                arr[r]= t;
                l++;
            }
            r++;
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
