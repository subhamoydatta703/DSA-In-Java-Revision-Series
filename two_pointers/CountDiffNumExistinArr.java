package two_pointers;

public class CountDiffNumExistinArr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int l = 0, r = l + 1, count = 1;
        while (r < arr.length) {
            if (arr[l] != arr[r]) {
                if (arr[r - 1] == arr[l]) {
                    count++;
                    l = r;
                }
            }
            if (arr[l] == arr[r]) {
                r++;
            }
        }
        // Alternative
        // while(r<arr.length){

        // if(arr[l] != arr[r]){
        // count++;
        // l = r;
        // }
        // r++;
        // }
        System.out.println(count);
    }
}
