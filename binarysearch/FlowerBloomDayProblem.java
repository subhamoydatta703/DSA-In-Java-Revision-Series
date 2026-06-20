package binarysearch;

public class FlowerBloomDayProblem {
    static boolean isCheck(int bloomDays[], int mid, int m, int k) {
        int flowerCount = 0;
        int bouquet = 0;
        for (int num : bloomDays) {
            if (num <= mid) {
                flowerCount++;
                if (flowerCount == k) {
                    bouquet++;
                    flowerCount = 0;
                }
            } else {
                flowerCount = 0;
            }
        }

        return bouquet >= m;
    }

    static int minDaysToMakeBouquet(int bloomDays[], int m, int k) {
        if ((long) m * k > bloomDays.length)
            return -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, ans = Integer.MAX_VALUE;
        for (int num : bloomDays) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (isCheck(bloomDays, mid, m, k)) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int bloomDays[] = { 7, 7, 7, 11, 7, 12, 13 }, m = 2, k = 3;
        // int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, ans = 0;
        // for (int num : bloomDays) {
        // min = Math.min(min, num);
        // max = Math.max(max, num);
        // }
        // while (min <= max) {
        // int mid = min + (max - min) / 2;
        // if (isCheck(bloomDays, mid, m, k)) {
        // ans = mid;
        // max = mid - 1;
        // } else {
        // min = mid + 1;
        // }

        // }
        // System.out.println(ans);
        System.out.println(minDaysToMakeBouquet(bloomDays, m, k));

    }
}
