package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateElementsExample {
    public static void main(String[] args) {
        // Q4: Find duplicate element from an array

        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 2, 3, 1, 5, 2, 7 };
        boolean isDuplicate = false;
        ArrayList<Integer> al = new ArrayList<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {

            if (map.get(num) > 1) {
                isDuplicate = true;
                al.add(num);
            }
        }
        if (isDuplicate) {
            System.out.println(al.toString());
        } else {

            System.out.println("No duplicates");
        }

    }
}
