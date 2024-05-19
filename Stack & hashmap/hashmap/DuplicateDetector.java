package hashmap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateDetector {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4, 2};
        
        System.out.println(containsDuplicate(array1)); // Output: No
        System.out.println(containsDuplicate(array2)); // Output: Yes
    }

    public static String containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return "Yes";
            }
            set.add(num);
        }
        
        return "No";
    }
}
