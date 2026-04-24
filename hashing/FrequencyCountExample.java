package hashing;

import java.util.HashMap;

public class FrequencyCountExample {
    public static void main(String[] args) {
        // Q1: Frequency count
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1, 2, 2, 3, 1, 4, 3};
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);

    }
}
