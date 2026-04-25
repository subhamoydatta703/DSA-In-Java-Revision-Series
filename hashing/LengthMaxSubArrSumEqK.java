package hashing;

import java.util.HashMap;

public class LengthMaxSubArrSumEqK {
    public static void main(String[] args) {
        int arr[]= {1, 2, 1, 0, 1}, k =3;
        HashMap<Integer,Integer> map = new HashMap<>();
        int s=0, m = 0;
        for(int i=0; i<arr.length;i++){
           int c = arr[i];
            s += c;
            if(map.containsKey(s-k)){
                int l = i - map.get(s-k);
                m = Math.max(m,l);
            }
            
            map.put(s, i);
        }
        System.out.println(m);
    }
}
