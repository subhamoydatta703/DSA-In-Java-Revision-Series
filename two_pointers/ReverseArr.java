package two_pointers;

public class ReverseArr {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int l = 0, n = arr.length, r = n - 1;
        for (int i = 0; i < n / 2; i++) {
            int t = arr[l];
            arr[l]= arr[r];
            arr[r]=t;
            l++;
            r--;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
