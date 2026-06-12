package prefixsum;

public class CountSubArrSumUsingPrefixSum {

  public static void main(String[] args) {
    int arr[] = {1,2,3,4}, x = 5;
    int n = arr.length, count = 0;
    int prefix[] = new int[n];
    prefix[0] = arr[0];
    for(int i=1; i<n; i++){
        prefix[i] = prefix[i-1] + arr[i];
    }
    
    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            int sum = (i==0) ? prefix[j] : prefix[j]-prefix[i-1];
            if(sum == x) count++;
        }
    }
    System.out.println(count);
}
}
