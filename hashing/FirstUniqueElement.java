package hashing;

import java.util.HashMap;

public class FirstUniqueElement {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 1, 2, 1, 4 };
        // int arr[] = { 4, 5, 2, 2, 5, 4 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println(num);
                return;
            }
        }
        System.out.println("No unique elements");
    }
}
