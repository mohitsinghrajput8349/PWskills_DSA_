// Q4. Find out how many pass would be required to sort the following array in decreasing order
// using bubble sort
// Input Array {3,5,1,6,0}
public class BubbleSortPasses {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0};
        int passes = bubbleSortDescending(arr);
        System.out.println("Number of passes required: " + passes);
    }

    public static int bubbleSortDescending(int[] arr) {
        int n = arr.length;
        int passes = 0;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    // swap arr[i] and arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            passes++;
        } while (swapped);
        
        return passes;
    }
}


// Pass 1: {5, 3, 6, 1, 0} (First pass, 5 and 3 are swapped)
// Pass 2: {5, 6, 3, 1, 0} (Second pass, 6 and 3 are swapped)
// Pass 3: {6, 5, 3, 1, 0} (Third pass, 6 and 5 are swapped)
// Pass 4: {6, 5, 3, 1, 0} (No swaps, array is sorted)
// In this case, it took 3 passes to sort the array 
// So, the answer is 3 passes.