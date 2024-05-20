public class SubsetProduct {
    public static boolean isSubsetProduct(int[] nums, int n, int target) {
        return canFormProduct(nums, 0, n, target);
    }

    private static boolean canFormProduct(int[] nums, int index, int n, int target) {
        // Base case: if target is 1, we have found a valid subset
        if (target == 1) {
            return true;
        }

        // Base case: if we've considered all elements
        if (index == n) {
            return false;
        }

        // Consider the current element and move to the next
        if (nums[index] <= target && nums[index] > 0 && target % nums[index] == 0) {
            if (canFormProduct(nums, index + 1, n, target / nums[index])) {
                return true;
            }
        }

        // Skip the current element and move to the next
        if (canFormProduct(nums, index + 1, n, target)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 5;
        int target = 16;
        int[] array = {2, 3, 2, 5, 4};
        boolean result = isSubsetProduct(array, n, target);
        System.out.println(result ? "YES" : "NO");
    }
}
