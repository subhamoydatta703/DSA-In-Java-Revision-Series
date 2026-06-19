package binarysearch;

public class FindNthFloorOfAnInt {
    static long power(long base, int exp, int x) {
        if (exp == 0)
            return 1;
        if (base == 0)
            return 0;

        long result = 1;

        for (int i = 0; i < exp; i++) {
            // result * base > Long.MAX_VALUE => result * base implements first so it
            // overflows before checking condition. Solution => result > Long.MAX_VALUE/base
            // => no multiplication first => no overflow happens
            if (base > 0 && result > Long.MAX_VALUE / base) {
                return Long.MAX_VALUE;
            } else if (result > x) {
                return result;
            }
            result *= base;
        }

        return result;
    }

    static int findNthFloorValue(int x, int n) {
        int l = 0, r = x, ans = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (power(m, n, x) <= x) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int x = 27, n = 3;
        System.out.println(findNthFloorValue(x, n));
    }
}
