import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniquePermutations {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), result, used);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> result, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                    continue;
                }
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(nums, tempList, result, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        UniquePermutations solution = new UniquePermutations();
        int[] nums = {1, 1, 2};
        List<List<Integer>> permutations = solution.permuteUnique(nums);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
