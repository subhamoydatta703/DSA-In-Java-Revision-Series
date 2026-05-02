package revision.hashmap_revision;

import java.util.HashMap;

public class CheckSubset {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 }, arr2[] = { 2, 4 };
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!map.containsKey(arr2[i])) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
