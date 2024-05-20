import java.util.Scanner;

public class LargestElement2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Input the elements of the 2D array
        System.out.println("Enter the elements of the 2D array:");
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Find the largest element in the 2D array
        int largest = array[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] > largest) {
                    largest = array[i][j];
                }
            }
        }

        // Print the largest element
        System.out.println("The largest element in the 2D array is: " + largest);

        scanner.close();
    }
}
