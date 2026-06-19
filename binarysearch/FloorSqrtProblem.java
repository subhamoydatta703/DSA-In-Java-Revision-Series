package binarysearch;

// The largest integer n such that n² ≤ x
public class FloorSqrtProblem {
    static int findFloorSqrt(int x) {
        int l = 0, r = x, ans = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            // (m*m) => can cause overflow =>solution => long or using m = x/m(if using m <=
            // x/m, then use l = 1)
            if ((long) m * m <= x) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(findFloorSqrt(x));
    }
}
