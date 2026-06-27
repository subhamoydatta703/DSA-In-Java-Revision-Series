package revision.binarysearch;

public class FloorSqrtProblem {
    static long floorSqrt(int x) {
        if (x == 0)
            return 0;
        int s = 1, e = x, ans = 0;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m > Long.MAX_VALUE / m) {
                return Long.MAX_VALUE;
            } else if (m <= x / m) {
                ans = m;
                s = m + 1;
            } else {
                e = m - 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(floorSqrt(16));
    }
}