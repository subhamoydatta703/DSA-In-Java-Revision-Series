package revision;

import java.util.HashMap;

public class UnionofArr {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 }, arr2[] = { 3, 4, 5, 6, 7 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            if (!map.containsKey(num)) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        for (int num : map.keySet()) {
            System.out.print(num + " ");
        }
    }
}
