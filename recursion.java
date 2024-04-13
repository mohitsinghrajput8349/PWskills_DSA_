
//given an integer  find out  the sum of  its digits  using recursion 
//Inputs n =1234;
//output 10; 
//explanation = 1+2+3+4;

public class Main {
    public static int sumOfDigits(int n) {
        // base case: if the number is a single digit, return the number itself;
        if (n < 10) {
            return n; //return the number
        }
        // Recursive case: Add the last digit to the sum of the digits of the remaining number
        else {
            return n % 10 + sumOfDigits(n / 10); //if the number is even 
        }
    }

    public static void main(String[] args) {
        int n ;
        System.out.println("Sum of digits of " + n + " is " + sumOfDigits(n));
    }
}
