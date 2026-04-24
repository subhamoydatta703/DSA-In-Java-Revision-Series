package hashing;

import java.util.HashMap;

public class TwoSumWithHashMap {
    public static void main(String[] args) {
        int arr[] ={1,2,7,3,5}, target =9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            int need = target - curr;
            if(map.containsKey(need)){
                System.out.println("Pair: "+ need + " "+ curr);
            }
            map.put(curr, i);
        }
    }
}
