public class MiddleRowAndColumn {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        displayMiddleRowAndColumn(matrix);
    }

    public static void displayMiddleRowAndColumn(int[][] matrix) {
        int size = matrix.length;
        int middle = size / 2;

        // Display middle row
        System.out.println("Middle Row:");
        for (int j = 0; j < size; j++) {
            System.out.print(matrix[middle][j] + " ");
        }
        System.out.println();

        // Display middle column
        System.out.println("Middle Column:");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][middle] + " ");
        }
    }
}
