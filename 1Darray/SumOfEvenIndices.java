public class SumOfEvenIndices {
    public static void main(String[] args) {
        int[] arr1 = {3, 20, 4, 6, 9};
        int[] arr2 = {4, 3, 6, 7, 1};

        System.out.println("Output 1: " + sumOfEvenIndices(arr1));
        System.out.println("Output 2: " + sumOfEvenIndices(arr2));
    }

    public static int sumOfEvenIndices(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }
}
