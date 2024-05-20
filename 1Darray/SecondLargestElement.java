public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr1 = {34, 21, 54, 65, 43};
        int[] arr2 = {4, 3, 6, 7, 1};

        System.out.println("Output 1: " + findSecondLargest(arr1));
        System.out.println("Output 2: " + findSecondLargest(arr2));
    }

    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax;
    }
}
