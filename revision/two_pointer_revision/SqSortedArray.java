package revision.two_pointer_revision;

public class SqSortedArray {
    public static void main(String[] args) {
        int arr[]={-4,-3,-1,0,1,3,4};
        int n = arr.length, l=0, r=n-1, arr2[] = new int[n], k =n-1;
        while(l<=r){
            if(Math.abs(arr[l])>Math.abs(arr[r])){
                arr2[k] = arr[l]*arr[l];
                l++;
            }
            else{
                arr2[k] = arr[r]*arr[r];
                r--;

            }
            k--;
        }
        for(int num: arr2){
            System.out.print(num+" ");
        }
    }
}
