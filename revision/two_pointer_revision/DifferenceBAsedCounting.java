package revision.two_pointer_revision;

public class DifferenceBAsedCounting {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7}, k=3;
        int n = arr.length, l=0, r=l+1, count=0;
        while(r<n){
            if((arr[r]-arr[l])<k){
                count+=r-l;
                r++;
            }else{
                l++;
            }
        }
        System.out.println(count);
    }
}
