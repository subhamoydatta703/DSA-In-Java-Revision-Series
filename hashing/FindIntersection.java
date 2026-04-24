package hashing;

import java.util.HashMap;

public class FindIntersection {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 2 };
        int arr2[] = { 3, 5, 1, 9 };
        boolean isFind = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            if (map.containsKey(num)) {
                System.out.print(num + " ");
                isFind = true;
            }
        }

        if(!isFind){
            System.out.println("No elements matched");
        }
        
    }
}
