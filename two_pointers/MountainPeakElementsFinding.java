package two_pointers;

public class MountainPeakElementsFinding {
    public static void main(String[] args) {
      
        
        int arr[] = {1, 3, 5, 4, 2};
        int n = arr.length, l = 0, r=l+1;

        while (r < n-1) {
        if(arr[r]>arr[l] && arr[r]> arr[r+1]){
            System.out.println(arr[r]);
            
        }
        l++;
        r++;

        }
    }
}
