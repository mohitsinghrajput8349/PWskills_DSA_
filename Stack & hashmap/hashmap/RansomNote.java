package hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Create a hashmap to store the character frequencies in magazine
        Map<Character, Integer> magazineFreq = new HashMap<>();
        
        // Count the frequency of each character in magazine
        for (char ch : magazine.toCharArray()) {
            magazineFreq.put(ch, magazineFreq.getOrDefault(ch, 0) + 1);
        }
        
        // Iterate through the ransom note characters
        for (char ch : ransomNote.toCharArray()) {
            // If the character is not present in the magazine or its frequency is 0, return false
            if (!magazineFreq.containsKey(ch) || magazineFreq.get(ch) == 0) {
                return false;
            }
            // Decrease the frequency of the character in the magazine
            magazineFreq.put(ch, magazineFreq.get(ch) - 1);
        }
        
        // If all characters in ransom note are found in magazine with enough frequency, return true
        return true;
    }

    public static void main(String[] args) {
        RansomNote solution = new RansomNote();
        String ransomNote1 = "a", magazine1 = "b";
        String ransomNote2 = "aa", magazine2 = "ab";
        
        System.out.println(solution.canConstruct(ransomNote1, magazine1)); // Output: false
        System.out.println(solution.canConstruct(ransomNote2, magazine2)); // Output: false
    }
}
