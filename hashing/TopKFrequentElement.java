package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int arr[]={1,1,1, 2, 2,3,4,4,4,4,4}, k =2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->Integer.compare(map.get(b), map.get(a)));
        for(int i =0; i<k; i++){
            System.out.println(list.get(i));
        }
    }
}
