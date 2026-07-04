package two_pointers;

public class RemoveDuplicatesReturnNewLen {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 2, 3, 3, 4 }, l = 0, r = l + 1;
        int arr[] = {0,0,1,1,1,1,2,3,3}, l = 0, r = l + 1;
        while (r < arr.length) {
            if (arr[l] != arr[r]) {
                l++;
                arr[l] = arr[r];
            }
            r++;
        }
        for (int i = 0; i <= l; i++) {
            System.out.println("l: "+l);
        }
        System.out.println("\nLength: " + (l + 1));
    }
}
