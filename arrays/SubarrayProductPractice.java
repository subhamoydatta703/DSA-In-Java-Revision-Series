package arrays;

public class SubarrayProductPractice {
  
    static int numSub(int[] nums, int k) {
      int n = nums.length, count =0;  
      for(int i=0; i<n; i++){
        int prod =1;
        int start = i;
        if(i==start){
          if(nums[i]<k){
            count++;
            start++;
          }
          else{
            start++;
          }
        }else if(start>i){
          prod = prod * nums[i]* nums[start];
          if(prod<k){
            count++;
            start++;
          }
          else{
            start++;
            
          }
          
        }
      }
      return count;
    }
    static int numArr(int nums[], int k){
      int i=0, n= nums.length, j = n-1, count =0;
      while(i<=j){
        int prod =1;
        if(i==j){
          prod = prod * nums[i]*nums[j];
          i++;
          j=n-1;
          if(prod<k){
            count++;
            j--;
          }
          else{
            j--;
          }
        }
        else{
          prod = prod*nums[i]*nums[j];
          if(prod<k){
            count++;

          }else{
            j--;
          }
        }
      }
      return count;
    }
    public static void main(String[] args) {
        		int nums[]= {-7,-4,-1,5,9,12, 12, 9};
            // int Arr
      //       Arrays.sort(nums)
      //       int  head=0, tail =0, x=0,y=0;
      //       for(int i =0; i<nums.length;i++){
      //         if((nums[head]+nums[tail])==-(nums[i])){
      //           x=nums[head];
      //           y=nums[tail];
      //         }
      //         else if
      //           ((nums[head]+nums[tail])>-(nums[i])){
      //             tail--;
                
      //         }
      //         else{
      //           head++;
      //         }
      //       }
      // System.out.println(x+" "+y);
System.out.print(numArr(nums, 100));

}
}
