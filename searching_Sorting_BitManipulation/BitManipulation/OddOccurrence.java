// Q5. Given an integer array, duplicates are present in it in a way that all duplicates appear an even
// number of times except one which appears an odd number of times. Find that odd appearing
// element in linear time and without using any extra memory.
// For example,
// Input : arr[] = [4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3]
// Output : The odd occurring element is 4.
public class OddOccurrence {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
        System.out.println("The odd occurring element is " + findOddOccurrence(arr));
    }
    
    public static int findOddOccurrence(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            // XOR all elements of the array
            result ^= arr[i];
        }
        return result;
    }
}
