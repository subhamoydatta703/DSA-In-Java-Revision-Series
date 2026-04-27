package revision;

import java.util.HashMap;

public class CountSubArrSumEqtoK {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 1, 0, 1, 0, 1 }, k = 2, sum = 0, count = 0;
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            sum += curr;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println("map: " + map);
        if (count == 0) {
            System.out.println("Not find");
        } else {
            System.out.println(count);
        }
    }
}
