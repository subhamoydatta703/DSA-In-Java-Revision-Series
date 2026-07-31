package revision.backtracking;

public class CountAllSimplePathsInGrid {
    static boolean isSafe(int arr[][], boolean vis[][], int i, int j, int n) {
        if (i < 0 || i >= n || j < 0 || j >= n) {
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

    static boolean solve(int arr[][], boolean vis[][], int i, int j, int k, int l, int n, int count) {
        if (arr[0][0] == 1 || arr[k][l] == 1) {
            return false;
        }

        if (i == k && j == l) {
            System.out.println("Path counts: " + count);
            return true;
        }

        vis[i][j] = true;

        if (isSafe(arr, vis, i + 1, j, n)) {
            if (solve(arr, vis, i + 1, j, k, l, n, count + 1)) {
                return true;
            }
        }

        if (isSafe(arr, vis, i, j - 1, n)) {
            if (solve(arr, vis, i, j - 1, k, l, n, count + 1)) {
                return true;
            }
        }

        if (isSafe(arr, vis, i, j + 1, n)) {
            if (solve(arr, vis, i, j + 1, k, l, n, count + 1)) {
                return true;
            }
        }

        if (isSafe(arr, vis, i - 1, j, n)) {
            if (solve(arr, vis, i - 1, j, k, l, n, count + 1)) {
                return true;
            }
        }

        vis[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        int grid[][] = {
                { 0, 1 },
                { 0, 0 }
        };

        int n = grid.length;

        solve(grid, new boolean[n][n], 0, 0, 1, 1, n, 0);
    }
}