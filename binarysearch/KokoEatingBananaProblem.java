package binarysearch;

public class KokoEatingBananaProblem {
    static int kokoBananaEatProb(int bananaPiles[], int h) {
        int n = bananaPiles.length, min = 1, max = 0;
        for (int banana : bananaPiles) {
            max = Math.max(max, banana);
        }
        int ans = max;
        while (min <= max) {
            int toatalTimeTaken = 0;
            int m = min + (max - min) / 2;
            for (int i = 0; i < n; i++) {
                toatalTimeTaken += (bananaPiles[i] + m - 1) / m;
            }
            if (toatalTimeTaken <= h) {
                ans = m;
                max = m - 1;
            } else {
                min = m + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 11 }, h = 8;
        // int n = arr.length, min = 1, max = 0;
        // for(int num: arr){
        // max = Math.max(max, num);
        // }
        // int ans = max;
        // while (min <= max) {
        // int toatalTimeTaken = 0;
        // int m = min + (max - min) / 2;
        // for (int i = 0; i < n; i++) {
        // toatalTimeTaken += (arr[i] + m - 1) / m;
        // }
        // if (toatalTimeTaken <= h) {
        // ans = m;
        // max = m-1;
        // }
        // else {
        // min = m+1;
        // }
        // }
        System.out.println(kokoBananaEatProb(arr, h));
    }
}
