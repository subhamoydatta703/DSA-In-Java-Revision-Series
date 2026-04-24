package hashing;

import java.util.HashMap;

public class LongestConsecutiveSequenceExample {
    public static void main(String[] args) {
         HashMap<Integer, Integer> map =new HashMap<>();
        int arr[] ={100, 4, 200, 1,3,2};
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int longest =0;
        for(int num: map.keySet()){
            if(!map.containsKey(num-1)){
                int curr = num;
                int count=1;

                while(map.containsKey(curr+1)){
                    count++; curr++;
                }
                longest = Math.max(count, longest);
                
            }
        }
    }
}
    
