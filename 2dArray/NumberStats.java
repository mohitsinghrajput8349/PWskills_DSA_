// package 2D array;

import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for m and n
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int positiveCount = 0, negativeCount = 0, oddCount = 0, evenCount = 0, zeroCount = 0;

        // Taking m * n integer inputs from the user
        System.out.println("Enter " + (m * n) + " integers:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = scanner.nextInt();
                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        // Printing the counts
        System.out.println("Number of positive numbers = " + positiveCount);
        System.out.println("Number of negative numbers = " + negativeCount);
        System.out.println("Number of odd numbers = " + oddCount);
        System.out.println("Number of even numbers = " + evenCount);
        System.out.println("Number of 0 = " + zeroCount);

        scanner.close();
    }
}
