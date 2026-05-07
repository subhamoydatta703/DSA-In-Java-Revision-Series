package revision.two_pointer_revision;

public class CountPairSumStrictlyGreaterThanTarget {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6}, t =7;
        int n = arr.length, l=0, r = n-1,count=0;
        while(l<r){
            if((arr[l]+arr[r])==t){
                l++;
            }
            else if((arr[l]+arr[r])<t)l++;
            else{
                count += r-l;
                // return;
                r--;
                
            }
        }
        System.out.println(count);
    }
}
