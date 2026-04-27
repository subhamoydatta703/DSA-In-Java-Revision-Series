package revision;

import java.util.HashMap;

public class LongSubArrSumEqtoK {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 1, 2, 1, 0, 1 }, k = 3, sum = 0, max = 0;
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            sum += curr;
            if (map.containsKey(sum - k)) {
                int l = i - map.get(sum - k);
                max = Math.max(max, l);
            }
            map.put(sum, i);
        }

        if (max == 0) {
            System.out.println("Not find");
        } else {

            System.out.println(max);
        }
    }
}
