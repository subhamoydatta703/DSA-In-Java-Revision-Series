package revision.two_pointer_revision;

public class CountNumberOfUniqueElements {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,4,4};
        int n = arr.length, l =0, count =1, r=1;
        while(r<n){
            if(arr[l] != arr[r]){
                count++;
            }
            l++;r++;
        }
        System.out.println(count);
    }
}
