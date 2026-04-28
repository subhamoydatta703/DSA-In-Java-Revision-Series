package two_pointers;

public class ChechPalindrome {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        int n = arr.length, l=0, r = n-1;
        for(int i =0; i<n/2; i++){
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
