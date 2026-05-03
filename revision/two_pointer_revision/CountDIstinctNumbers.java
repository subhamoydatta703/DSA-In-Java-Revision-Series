package revision.two_pointer_revision;

public class CountDIstinctNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5};
        int n = arr.length, l =0, r=l+1, count=1;
        while(r<n){
            if(arr[l] != arr[r]){
                count++;
            }
            l++;
            r++;
        }
        System.out.println(count);
    }
}

