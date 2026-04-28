package two_pointers;

public class FindTwoNumSumEqtoK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,8,9}, k = 10;
        int l =0, r = arr.length-1;
        while(l<r){
            int sum = arr[l]+ arr[r];
            if(sum==k){
                System.out.println("Yes: "+arr[l]+"  "+arr[r]);
                l++;
            }
            else if(sum<k){
                l++;
            }else{
                r--;
            }
        }
        

    }
}
