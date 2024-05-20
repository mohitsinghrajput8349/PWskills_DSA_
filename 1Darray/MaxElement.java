public class MaxElement {
    public static void main(String[] args) {
        int[] arr1 = {34, 21, 54, 65, 43};
        int[] arr2 = {4, 3, 6, 7, 1};

        System.out.println("Output 1: " + findMax(arr1));
        System.out.println("Output 2: " + findMax(arr2));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
