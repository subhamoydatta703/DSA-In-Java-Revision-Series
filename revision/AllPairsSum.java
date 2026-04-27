package revision;

import java.util.HashMap;

public class AllPairsSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 6;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int need = target - curr;
            if (map.containsKey(need)) {
                System.out.println(curr + " + " + need + " = " + target);
            }
            map.put(curr, i);
        }

    }
}
