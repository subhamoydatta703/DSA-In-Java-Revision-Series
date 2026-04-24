package hashing;

import java.util.HashMap;

public class TwoSumIndicesExample {
    public static void main(String[] args) {
        // Q3: two sum
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[]={2, 7, 11, 15}, target=9;
        for(int i =0; i<arr.length; i++){
            int curr = arr[i];
            int need = target - curr;
            if(map.containsKey(need)){
                System.out.println("Pair of indices: "+map.get(need)+", "+i);
                return;
            }
            
                map.put(curr, i);
        

        
            

        }
    }
}
