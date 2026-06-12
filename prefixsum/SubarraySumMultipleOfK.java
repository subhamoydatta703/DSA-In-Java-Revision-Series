package prefixsum;

import java.util.HashMap;

public class SubarraySumMultipleOfK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3}, k = 3;
        int n = arr.length, cumSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            cumSum += arr[i];
            if(map.containsKey(cumSum%k)){
                if(i-map.get(cumSum%k)>=2){
                    System.out.println(true);
                    return;
                }
            }else{
                map.put((cumSum%k), i);
            }

        }
        System.out.println(false);
    }
}
