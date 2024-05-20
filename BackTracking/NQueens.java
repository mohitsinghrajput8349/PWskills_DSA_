public class NQueens {
    public int totalNQueens(int n) {
        int[] count = {0}; // To store the count of solutions
        boolean[] cols = new boolean[n]; // To check if a column is occupied by a queen
        boolean[] diag1 = new boolean[2 * n - 1]; // To check major diagonal
        boolean[] diag2 = new boolean[2 * n - 1]; // To check minor diagonal
        solveNQueens(0, n, cols, diag1, diag2, count);
        return count[0];
    }

    private void solveNQueens(int row, int n, boolean[] cols, boolean[] diag1, boolean[] diag2, int[] count) {
        if (row == n) {
            count[0]++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (cols[col] || diag1[row - col + n - 1] || diag2[row + col]) {
                continue; // Skip if the column or diagonal is already occupied
            }
            cols[col] = diag1[row - col + n - 1] = diag2[row + col] = true;
            solveNQueens(row + 1, n, cols, diag1, diag2, count); // Place next queen
            cols[col] = diag1[row - col + n - 1] = diag2[row + col] = false; // Backtrack
        }
    }

    public static void main(String[] args) {
        NQueens solution = new NQueens();
        System.out.println(solution.totalNQueens(4)); // Output: 2
        System.out.println(solution.totalNQueens(1)); // Output: 1
    }
}
