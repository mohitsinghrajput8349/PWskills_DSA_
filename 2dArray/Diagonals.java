import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the square matrix
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        // Input the elements of the square matrix
        System.out.println("Enter the elements of the square matrix:");
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the elements of both diagonals
        System.out.println("Elements of the main diagonal:");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        System.out.println("Elements of the secondary diagonal:");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][size - i - 1] + " ");
        }

        scanner.close();
    }
}
