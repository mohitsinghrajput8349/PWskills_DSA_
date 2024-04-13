                                                 //question no 1
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



                                       //question no 2

// : Given a number n. Find the sum of natural numbers till n but with alternate signs.

// That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.

// Constraints : 0<=n<=1e6

// Input1 : n = 10

// Output 1 : -5

// Explanation : 1-2+3-4+5-6+7-8+9-10 = -5

// Input 2 : n = 5

// Output 2 : 3

public class Main {
    public static int sumOfAlternatingSigns(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i; // Subtract if i is even
            } else {
                sum += i; // Add if i is odd
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;
        
        System.out.println("Output 1: " + sumOfAlternatingSigns(n1));
        System.out.println("Output 2: " + sumOfAlternatingSigns(n2));
    }
}    





                              //question no 3
// Q3: Print the max value of the array [ 13, 1, -3, 22, 5]
public class Main {
    public static int findMax(int[] arr) {
        int max = arr[0]; // Initialize max with the first element of the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {13, 1, -3, 22, 5};
        System.out.println("Max value in the array: " + findMax(arr));
    }
}





                             //question no 4
    //Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10].
public class Main {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Add each element to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {92, 23, 15, -20, 10};
        System.out.println("Sum of values in the array: " + arraySum(arr));
    }
}

                          //question no 5
// 5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum 
// of every digit in that number raised to the power of total digits in that number is equal to the number.

// Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)

// Input1 : 153

// Output1 : Yes

// Input 2 : 134

//Output2 : No
public class Main {
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int numDigits = String.valueOf(n).length();
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }
        
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int input1 = 153;
        int input2 = 134;
        
        System.out.println("Output 1: " + (isArmstrong(input1) ? "Yes" : "No"));
        System.out.println("Output 2: " + (isArmstrong(input2) ? "Yes" : "No"));
    }
}

