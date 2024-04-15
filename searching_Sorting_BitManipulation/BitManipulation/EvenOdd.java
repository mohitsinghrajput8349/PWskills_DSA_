// Q3. Problem 1: Given a number. Using bit manipulation, check whether it is odd or even.
// Input 8, Even
// 3, False
public class EvenOdd {
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = 3;
        
        System.out.println("Input 1: " + number1 + ", " + (isEven(number1) ? "Even" : "Odd"));
        System.out.println("Input 2: " + number2 + ", " + (isEven(number2) ? "Even" : "Odd"));
    }
    
    public static boolean isEven(int number) {
       
        return (number & 1) == 0;
    }
}
