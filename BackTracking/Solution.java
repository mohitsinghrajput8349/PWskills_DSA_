import java.util.Arrays;

public class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % k != 0) {
            return false;
        }
        int target = totalSum / k;
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        return backtrack(nums, visited, k, target, 0, 0);
    }

    private boolean backtrack(int[] nums, boolean[] visited, int k, int target, int currentSum, int startIndex) {
        if (k == 0) {
            return true;  // Successfully formed k subsets
        }
        if (currentSum == target) {
            return backtrack(nums, visited, k - 1, target, 0, 0);  // Start to form next subset
        }
        for (int i = startIndex; i < nums.length; i++) {
            if (!visited[i] && currentSum + nums[i] <= target) {
                visited[i] = true;
                if (backtrack(nums, visited, k, target, currentSum + nums[i], i + 1)) {
                    return true;
                }
                visited[i] = false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 3, 2, 2};
        int k = 2;
        System.out.println(solution.canPartitionKSubsets(arr, k));  // Output: true
    }
}
