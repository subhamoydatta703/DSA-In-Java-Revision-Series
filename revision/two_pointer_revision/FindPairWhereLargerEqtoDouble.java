package revision.two_pointer_revision;

public class FindPairWhereLargerEqtoDouble {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 6, 6, 8 };
        int n = arr.length, l =0, r = l+1;
        while(r<n){
            if(arr[l]==arr[r]){r++; continue;}
            if((2*arr[l])>arr[r]){
                r++;
            }else if((2*arr[l])<arr[r]){
                l++;
            }else{
                System.out.println(arr[l]+" "+arr[r]);
                l++;
                r++;
            }
        }
    }
}
