package two_pointers;

public class FindFreqofTargetElement {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 3, 3, 3, 4,4,4,4,4,4,4,4,4,4,4,5 }, target = 4;
        int l = -1, r = -1, n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i]==target){
                l=i;
                break;
            }
        }
        for(int i =n-1; i>0; i--){
            if(arr[i]== target){
                r=i;
                break;
            }
        }
        if(l==-1) System.out.println("Not find");
        else System.out.println(r-l+1);
}
}
