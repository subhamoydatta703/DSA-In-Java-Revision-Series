package revision.prefixsum;

public class FindEqbIndex {
    public static void main(String[] args) {
        int arr[]={1, 3, 5,2,2}, n = arr.length;
        int prefixArr[]= new int[n], l=0, cumSum =0;
        for(int i=0; i<n; i++){
            cumSum += arr[i];
            prefixArr[i] = cumSum;
        }
        while(l<=n-1){
            int left = (l>0)? prefixArr[l-1] : 0;
            if(left == (prefixArr[n-1]-prefixArr[l])){
                System.out.println(l);
            }
            l++;
        }
    }
}
