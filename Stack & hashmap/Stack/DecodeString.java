package stack;
import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');  // Build the number k
            } else if (ch == '[') {
                // Push current number and string to their stacks
                numStack.push(k);
                strStack.push(currentString);
                // Reset for the next segment
                k = 0;
                currentString = new StringBuilder();
            } else if (ch == ']') {
                // Pop from stacks and decode the substring
                int repeatTimes = numStack.pop();
                StringBuilder decodedString = strStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;  // Continue with the decoded string
            } else {
                currentString.append(ch);  // Append current character to the string
            }
        }
        return currentString.toString();
    }

    public static void main(String[] args) {
        DecodeString solution = new DecodeString();
        String s = "3[a]2[bc]";
        System.out.println(solution.decodeString(s));  // Output: aaabcbc
    }
}
