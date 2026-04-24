package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputSortPractice {
    // static int[] sortArr(int[] arr){

    // }
    static void findElement(int[] arr, int x, int n, int i, int count) {
        // int count=0;
        // n = arr.length;
        if (i >= arr.length) {
            if (count == 2)
                System.out.println("YES");
            else
                System.out.println("NO");
            return;
        }
        //
        if (arr[i] == x && count < 1) {
            count++;
        }
        if (arr[i] == n && count < 2) {
            count++;
        }
        findElement(arr, x, n, i + 1, count);
 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int x = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }

        // for(int i = 1; i<arr.length; i++){
        //     if(arr[i]>arr[i-1]) continue;
        //     else{
        //         System.out.println("NO");
        //         return;
        //     }
        // }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // int count =0;
        // for(int i =0; i<arr.length; i++){
        //     if(arr[i]==x){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        // int max = arr[0];
        // int maxIdx = 0;

        // for (int i = 1; i < n; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // maxIdx = i;
        // }
        // }
        // int arr[] = { 1, 7, 5, 3, 2 };
        // findElement(arr, 1, 7, 0, 0);

    }
}
