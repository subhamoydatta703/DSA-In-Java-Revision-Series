package hashing;

import java.util.HashMap;

public class HighestFrequencyElements {
        public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 1, 2, 3, 2, 4, 3 };
        
        int max = 0;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // System.out.println(map.keySet());

        for (int num : map.keySet()) {
            max = Math.max(map.get(num), max);

        }
        for (int num : map.keySet()) {
            if (map.get(num) == max) {
                System.out.println("Key: " + num + ", freq: " + max);
                
            }
        }

    }
}
