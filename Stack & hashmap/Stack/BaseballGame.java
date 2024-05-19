package stack;
import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top); // push back the popped top element
                stack.push(newTop);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        BaseballGame solution = new BaseballGame();
        String[] ops = {"5", "2", "C", "D", "+"};
        System.out.println(solution.calPoints(ops));  // Output: 30
    }
}
