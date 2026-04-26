package hashing;

import java.util.HashMap;

public class CountSubArrSumEqK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3}, k = 3, c=0, s=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i =0; i<arr.length; i++){
            int curr = arr[i];
            s +=curr;
            if(map.containsKey(s-k)){
                c+=map.get(s-k);
            }
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        System.out.println(c);
    }
}
