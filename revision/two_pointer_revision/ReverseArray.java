package revision.two_pointer_revision;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n = arr.length, l =0, r = n-1;
        while(l<r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r]=  t;
            l++;
            r--;
        }
        for(int num: arr) System.out.print(num+" ");
        }
}
