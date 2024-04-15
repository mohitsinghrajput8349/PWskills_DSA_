// Given a number, count the number of set bits in that number without using an
// extra space.
// Note : bit ‘1’ is also known as set bit.
public class SetBitCounter {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
        
        System.out.println("Input 1: " + number1);
        System.out.println("Output 1: " + countSetBits(number1));
        System.out.println("Input 2: " + number2);
        System.out.println("Output 2: " + countSetBits(number2));
    }
    
    public static int countSetBits(int number) {
        int count = 0;
        
        while (number != 0) {
            
            if ((number & 1) == 1) {
                count++;
            }
           
            number >>= 1;
        }
        
        return count;
    }
}
