package sliding_window.variable_sized_window;

import java.util.HashMap;

public class MaxEqual01Substring {
    public static void main(String[] args) {
        String str = "0011001100";
        // String str = "110100";
        int arr[] = new int[str.length()];
        int n = arr.length, m = 0, s = 0, r=0, sum=0;
        for (int i = 0; i < str.length(); i++) {
            int x = str.charAt(i) - '0';
            if (x == 0) {
                arr[i] = -1;
            } else {

                arr[i] = x;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);


        while(r<n){
            sum += arr[r];
            if(map.containsKey(sum)){
                m = Math.max(m, (r-map.get(sum)));
            }else{
                map.put(sum, r);
            }
            r++;
        }
        System.out.println(m);
    }
}
