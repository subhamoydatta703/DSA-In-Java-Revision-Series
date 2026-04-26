package hashing;

import java.util.HashMap;

public class FindSubset {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 }, arr2[] = { 2, 7, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
      

        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], i);
        }

        for (int num : arr2) {

            if (!map.containsKey(num)) {

                System.out.println("No");
                return;
            } 
        }
        
            System.out.println("Yes");
      
    }
}
