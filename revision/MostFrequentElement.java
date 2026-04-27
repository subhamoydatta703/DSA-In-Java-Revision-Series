package revision;

import java.util.HashMap;

public class MostFrequentElement {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 1, 2, 3, 2, 2, 4, 3}, max = 0;
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);

        }
        for(int num: map.keySet()){
            max = Math.max(max, map.get(num));
        }
        for(int num: map.keySet()){
            if(map.get(num)==max){
                System.out.println(num);
            }
        }
    }
}
