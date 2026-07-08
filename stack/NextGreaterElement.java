package stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

public class NextGreaterElement {

    static int[] nextGreaterElmt(int arr[]) {
        Deque<Integer> s = new ArrayDeque<>();
        int nxtGrtElArr[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtGrtElArr[i] = -1;
            } else {
                nxtGrtElArr[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return nxtGrtElArr;
    }


    static int[] nextGreater(int arr[], int nums[]){
        int arr2[] = new int[nums.length];
        Deque<Integer> s = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=arr.length-1; i>=0; i--){
            // check in stack
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                map.put(arr[i], -1);
            }else{
                map.put(arr[i], arr[s.peek()]);
            }

            s.push(i);
        }
        for(int i =0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                arr2[i]=map.get(nums[i]);
            }

        }
        return arr2;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 }, nums[] = {6,0,1};
        System.out.println(Arrays.toString(nextGreaterElmt(arr)));
        System.out.println(Arrays.toString(nextGreater(arr, nums)));
    }
}
