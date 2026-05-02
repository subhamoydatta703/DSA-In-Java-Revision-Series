package revision.two_pointer_revision;

public class RemoveDuplicatesAndFindLength {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4};
        int n = arr.length, l =0, r = l+1;
        while(r<n){
             if(arr[l] != arr[r]){
                l++;
                arr[l]= arr[r];
            }
            r++;
        }
        System.out.println("Length: "+(l+1));
    }
}
