package revision.backtracking;

public class CheckGridPath {

    static boolean isSafe(int arr[][], boolean vis[][], int i, int j, int n) {
        if (i < 0 || j < 0 || i >= n || j >= n) {
            return false;
        }
        if (arr[i][j] == 1) {
            return false;
        }
        if (vis[i][j]) {
            return false;
        }
        return true;
    }

    static boolean solve(int arr[][], boolean vis[][], int i, int j, int k, int l, int n) {
        if (arr[i][j] == 1 || arr[k][l] == 1) {
            return false;
        }
        if (i == k && j == l) {
            return true;
        }
        vis[i][j] = true;
        // down
        if (isSafe(arr, vis, i + 1, j, n)) {
            if (solve(arr, vis, i + 1, j, k, l, n))
                return true;
        }
        // left
        if (isSafe(arr, vis, i, j - 1, n)) {
            if (solve(arr, vis, i, j - 1, k, l, n))
                return true;
        }
        // right
        if (isSafe(arr, vis, i, j + 1, n)) {
            if (solve(arr, vis, i, j + 1, k, l, n))
                return true;
        }
        // up
        if (isSafe(arr, vis, i - 1, j, n)) {
            if (solve(arr, vis, i - 1, j, k, l, n))
                return true;
        }
        vis[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 1, 1 },
                { 0, 0, 1 },
                { 1, 0, 0 }
        };
        int n = matrix.length;

        System.out.println(solve(matrix, new boolean[n][n], 0, 0, 1, 2, n));

    }
}
