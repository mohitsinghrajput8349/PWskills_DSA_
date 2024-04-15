// Problem 1: given a number, print its binary representation. [easy]
// Input 1: number = 5
// Output 1: 101
// Input 2: number = 10
// Output 2: 1010

public class DecimalToBinary {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
        
        System.out.println("Input 1: number = " + number1);
        System.out.println("Output 1: " + decimalToBinary(number1));
        System.out.println("Input 2: number = " + number2);
        System.out.println("Output 2: " + decimalToBinary(number2));
    }
    
    public static String decimalToBinary(int number) {
        // Base case
        if (number == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
          
            binary.insert(0, number % 2);
           
            number /= 2;
        }
        
        return binary.toString();
    }
}
