package two_pointers;

public class MoveAllZeroAtLastwithMaintainingOrder {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 0, 1 };
        // int arr[] = {0, 1, 0, 3, 12};
        int n = arr.length, l = 0, r = l + 1;
        while (r < n) {
            if (arr[r] !=0) {
                int t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
                l++;
                r++;
            } else if(arr[l]!=0 && arr[r]==0 ) {

                
                l++;
                r++;
            }
            else{
                r++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
