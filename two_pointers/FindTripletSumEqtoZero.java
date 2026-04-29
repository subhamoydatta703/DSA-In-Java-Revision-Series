package two_pointers;

import java.util.HashMap;

public class FindTripletSumEqtoZero {
    public static void main(String[] args) {
        int arr[] = { -3, -1, 0, 1, 2, 3 };
        // int arr[] = { -1, -1, 0, 2 };
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length, l = 0, r = l + 1;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // System.out.println(map);
        while (r < n) {
            int curr = arr[l] + arr[r];
            int need = 0 - curr;
            if (need == arr[l]) {
                r++;
                continue;
            }
            if (map.containsKey(need)) {
                System.out.println("("+arr[l] + ") + (" + arr[r] + ") + (" + need + ") = 0");
                l = r;
                r++;
            } else {
                r++;

            }
        }
    }
}
