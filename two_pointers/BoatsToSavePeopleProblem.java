package two_pointers;

public class BoatsToSavePeopleProblem {
    public static void main(String[] args) {
        int arr[]={1,2,3}, limit =4;
        // int arr[]={1,1,2,2}, limit =3;
        int n = arr.length, l=0, r = n-1, min = Integer.MAX_VALUE, count =0;
        for(int num:arr){
            if(num>limit){
                System.out.println("Impossible");
                return;
            }
        }
        while(l<=r){
            int sum = arr[l]+arr[r];
            if(sum <= limit){
                l++;
                r--;
            }
            // if(sum<limit)l++;
            else if(sum>limit)r--;
            count++;
            
        }
        System.out.println(count);
    }
}
