package arrays;

public class SubarraySumPractice {
    static int subarraySum(int[] nums, int k) {
     int l=0, n = nums.length, count =0;
     for(int r =0; r<n; r++){
        int sum =0;
        sum = nums[l]+nums[r];
        if(sum==k){
            count++;
        }
        l++;
     }   
     return count;
    }
    static void prefixSubArraySum(int arr[], int k) {
        int currSum = 0, count=0;;
        int prefix[] = new int[arr.length];
        // calculation of prefix sum
        prefix[0] = arr[0];
        for (int a = 1; a < prefix.length; a++) {
            prefix[a] = prefix[a - 1] + arr[a];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (currSum == k) {
                    count++;
                }

            }

        }
        System.out.println(count);
    }
        // prefix sub array sum
    public static void main(String[] args) {
        int arr[]={1,2,3,-3,1,1,1,4,2,-3};
        prefixSubArraySum(arr, 3);
    }
}
