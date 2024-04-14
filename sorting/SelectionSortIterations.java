
// Q5. Find out the number of iterations to sort the array in descending order using selection sort.
// Input Array {3,5,1,6,0}
public class SelectionSortIterations {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 6, 0 };
        int iterations = selectionSortDescending(arr);
        System.out.println("Number of iterations required: " + iterations);
    }

    public static int selectionSortDescending(int[] arr) {
        int n = arr.length;
        int iterations = 0;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                iterations++; // Counting each comparison
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap arr[i] and arr[maxIndex]
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        return iterations;
    }
}

// Pass 1: 4 comparisons (5 vs 3, 5 vs 1, 5 vs 6, 5 vs 0)
// Pass 2: 3 comparisons (3 vs 1, 3 vs 6, 3 vs 0)
// Pass 3: 2 comparisons (1 vs 6, 1 vs 0)
// Pass 4: 1 comparison (6 vs 0)
// Total iterations = 4 + 3 + 2 + 1 = 10 iterations.

// So, the answer is 10 iterations.