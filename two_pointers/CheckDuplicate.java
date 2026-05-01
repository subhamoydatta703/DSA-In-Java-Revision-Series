package two_pointers;

public class CheckDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 5 };
        int l = 0, r = l + 1;
        while(r < arr.length) {
            if(arr[l] != arr[r]){
                r++;
                l++;
            }
            else if(arr[l]==arr[r]){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
