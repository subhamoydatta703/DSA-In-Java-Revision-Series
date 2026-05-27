package revision.two_pointer_revision;

public class DutchNationalFlag {
    static void swap(int arr[], int a, int b){
        int t = arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        int n=arr.length, l =0, m=0, r=n-1;
        if(n==1){
            System.out.println(arr[0]);
            return;
        }
        while(m<=r){
            if(arr[m]==0){
                swap(arr, m, l);
                l++;
                m++;
            }
            else if(arr[m]==2){
                swap(arr, m, r);
                r--;
            }
            else if(arr[m]==1){
                m++;
            }
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
