package backtracking;

import java.util.ArrayList;
import java.util.List;

public class RatInMaizeProblem {
    static boolean isSafe(int i, int j, int maze[][], int n, boolean[][] vis) {
        if (i < 0 || i >= n || j < 0 || j >= n)
            return false;
        if (maze[i][j] == 0)
            return false;
        if (vis[i][j])
            return false;
        return true;
    }

    static void solve(int i, int j, int maze[][], int n, List<String> ans, StringBuilder sb, boolean vis[][]) {
        if (i == n - 1 && j == n - 1) {
            ans.add(sb.toString());
            return;
        }

        vis[i][j] = true;

        // down
        if (isSafe(i + 1, j, maze, n, vis)) {
            sb.append('D');
            solve(i + 1, j, maze, n, ans, sb, vis);

            sb.deleteCharAt(sb.length() - 1);
        }
        // left
        if (isSafe(i, j - 1, maze, n, vis)) {
            sb.append('L');
            solve(i, j - 1, maze, n, ans, sb, vis);

            sb.deleteCharAt(sb.length() - 1);
        }
        // Right
        if (isSafe(i, j + 1, maze, n, vis)) {
            sb.append('R');
            solve(i, j + 1, maze, n, ans, sb, vis);

            sb.deleteCharAt(sb.length() - 1);
        }
        // up
        if (isSafe(i - 1, j, maze, n, vis)) {
            sb.append('U');
            solve(i - 1, j, maze, n, ans, sb, vis);

            sb.deleteCharAt(sb.length() - 1);
        }

        vis[i][j] = false;

    }

    static List<String> findPAth(int maze[][], int n) {

        List<String> ans = new ArrayList<>();
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return ans;
        }

        solve(0, 0, maze, n, ans, new StringBuilder(), new boolean[n][n]);
        return ans;
    }

    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };

        int n = maze.length;
        System.out.println(findPAth(maze, n));
    }
}
