class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] t = new int[m][n];
        // Initialize the memoization array with -1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = -1;
            }
        }
        return solve(grid, m - 1, n - 1, t);
    }
    private int solve(int[][] arr, int m, int n, int[][] t) {
        if (m == 0 && n == 0) {
            return arr[0][0];
        } else if (m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        }
        if (t[m][n] != -1) {
            return t[m][n];
        }
        int fromTop = solve(arr, m - 1, n, t);
        int fromLeft = solve(arr, m, n - 1, t);

        if (fromTop != Integer.MAX_VALUE) {
            fromTop += arr[m][n];
        }
        if (fromLeft != Integer.MAX_VALUE) {
            fromLeft += arr[m][n];
        }
        
        t[m][n] = Math.min(fromTop, fromLeft);
        return t[m][n];
    }
}
