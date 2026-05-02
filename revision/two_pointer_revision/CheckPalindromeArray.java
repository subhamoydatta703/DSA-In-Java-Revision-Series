package revision.two_pointer_revision;

public class CheckPalindromeArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,1};
        int n=arr.length, l =0, r = n-1;
        while(l<r){
            if(arr[l] != arr[r]){
                System.out.println("No");
                return;
            }
            l++;
            r--;
        }
        System.out.println("Yes");
    }
}
