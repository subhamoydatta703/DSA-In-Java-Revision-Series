package two_pointers;

public class SqEachArrElementReturnSortArr {
    public static void main(String[] args) {
        int arr[] ={-4, -1, 0, 3, 10};
        int n = arr.length, l =0, r =n-1;
        for(int i =0; i<n; i++){
            int sq = arr[i] * arr[i];
            arr[i] = sq;
        }
        while(l<r){
            if(arr[r]>arr[l]){
                r--;
            }
            else if(arr[l]>arr[r]){
                int t = arr[l];
                arr[l]= arr[r];
                arr[r]=t;
                r--;
            }
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
