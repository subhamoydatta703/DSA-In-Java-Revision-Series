package revision.two_pointer_revision;

public class CheckDuplicateElements {

    static int duplicateValue(int arr[]){
        int n = arr.length, r =0;
        while(r<n){
            int l =0;
            while(l<r){
                 if(arr[l] ==arr[r]){
                    return arr[l];
                }
                l++;
            }
            r++;
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[]={1,1,2,3,3,4,5,7,7,7,8};
        int arr[]={3,1,3,4,2};
        //  int arr[]={1,2,5,7,9};
    //     int n = arr.length, l=0, r=l+1;

    //     while(r<n){
    //         if(arr[l]==arr[r]){
    //             System.out.println("Yes");
    //             return;
    //         }
    //         l++;
    //         r++;
    //     }
    //     System.out.println("No");
    // 
    System.out.println(duplicateValue(arr));
}
}
