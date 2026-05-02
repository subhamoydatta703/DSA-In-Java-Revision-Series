package revision.hashmap_revision;

import java.util.HashMap;

public class FindUniqueElement {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 4, 5, 1, 2, 1, 4 };
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if (map.containsKey(curr) && (map.get(curr) == 1)) {
                System.out.println(curr);
                return;
            }
        }
        System.out.println("No unique elements");
    }
}
