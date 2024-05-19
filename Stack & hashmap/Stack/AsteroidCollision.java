package stack;


import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean destroyed = false;
            
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (Math.abs(asteroid) > Math.abs(stack.peek())) {
                    stack.pop();
                } else if (Math.abs(asteroid) == Math.abs(stack.peek())) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            
            if (!destroyed) {
                stack.push(asteroid);
            }
        }
        
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }

    public static void main(String[] args) {
        AsteroidCollision solution = new AsteroidCollision();
        int[] asteroids1 = {5, 10, -5};
        int[] asteroids2 = {8, -8};
        int[] asteroids3 = {10, 2, -5};
        
        System.out.println(Arrays.toString(solution.asteroidCollision(asteroids1)));  // Output: [5, 10]
        System.out.println(Arrays.toString(solution.asteroidCollision(asteroids2)));  // Output: []
        System.out.println(Arrays.toString(solution.asteroidCollision(asteroids3)));  // Output: [10]
    }
}
