package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PairSumInputPractice {

    static void pairSum(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t;
        t = sc.nextInt();
        while(t>0){
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int m = sc.nextInt();

        // int[] arr2 = new int[m];

        // for (int i = 0; i < m; i++) {
        //     arr2[i] = sc.nextInt();
        // }

        // HashSet<Integer> set = new HashSet<>();
        // HashSet<Integer> set2 = new HashSet<>();
        // for (int num : arr) {
        //     set.add(num);
        // }
        // for (int num : arr2) {
        //     if (set.contains(num)) {
        //         set2.add(num);
        //     }
        // }

        // // System.out.println(set2);

        // // for(int i = 0; i<arr.length-1; i+=2){

        // // int temp = arr[i];
        // // arr[i] = arr[i + 1];
        // // arr[i + 1] = temp;
        // // }

        // // for (int i = 0; i < n; i++) {
        // // System.out.print(arr[i]+" ");
        // // }

        // // HashMap <Integer, Integer> map = new HashMap<>();
        // // for(int num: arr){
        // // map.put(num, map.getOrDefault(num, 0)+1);
        // // }

        // // for(int num: arr){
        // // if(map.get(num)==1){
        // // System.out.println(num);
        // // break;
        // // }
        // // }
        // sc.close();
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] + arr[j] == target) {
        //             count++;
        //         }
        //     }

        // }
        // System.out.println(count);
        t--;}
        // pairSum(arr, 7);

    }
}
