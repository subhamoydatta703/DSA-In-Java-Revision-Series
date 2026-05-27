package revision.two_pointer_revision;

public class BoatToSavePeople {
    public static void main(String[] args) {
        int arr[]={1,2,5,7}, limit = 2;
        for(int num: arr){
            if(num>limit){
                System.out.println("Impossible");
                return;
            }
        }
        int n = arr.length, l=0, r =n-1, count=0;
        while(l<=r){
            int sum = arr[l]+arr[r];
            if(sum<=limit){
                l++;
                r--;
            }
            else{ r--;}
            count++;
        }
        System.out.println(count);
    }
}
