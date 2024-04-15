// Q2. WAP to sort an array in descending order using selection sort
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}
public class selectionSort
{
    public static void main(String[] args) {
        
        int[] arr = {3, 5, 1, 6, 0};
        selectionSortDescending(arr);
        System.out.print("Sorted array in descending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap arr[i] and arr[maxIndex]
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}