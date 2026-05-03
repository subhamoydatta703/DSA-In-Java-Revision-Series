package revision.two_pointer_revision;

public class CheckDuplicateElements {
    public static void main(String[] args) {
        // int arr[]={1,1,2,3,3,4,5,7,7,7,8};
        int arr[]={1,2,5,7,9};
        int n = arr.length, l=0, r=l+1;
        while(r<n){
            if(arr[l]==arr[r]){
                System.out.println("Yes");
                return;
            }
            l++;
            r++;
        }
        System.out.println("No");
    }
}
