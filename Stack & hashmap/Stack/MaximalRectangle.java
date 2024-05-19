/*Q1. Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing
only 1's and return its area.


Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6
Explanation: The maximal rectangle is shown in the above picture.*/
package stack;

import java.util.Stack;
    public class MaximalRectangle {
        public int maximalRectangle(char[][] matrix) {
            if (matrix.length == 0) return 0;
            
            int maxArea = 0;
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[] heights = new int[cols];
            
            for (int i = 0; i < rows; i++) {
                // Update the heights array for the current row
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] == '1') {
                        heights[j]++;
                    } else {
                        heights[j] = 0;
                    }
                }
                // Calculate the maximum area for the current row's histogram
                maxArea = Math.max(maxArea, largestRectangleArea(heights));
            }
            
            return maxArea;
        }
        
        private int largestRectangleArea(int[] heights) {
            Stack<Integer> stack = new Stack<>();
            int maxArea = 0;
            int[] extendedHeights = new int[heights.length + 1];
            System.arraycopy(heights, 0, extendedHeights, 0, heights.length);
            
            for (int i = 0; i < extendedHeights.length; i++) {
                while (!stack.isEmpty() && extendedHeights[i] < extendedHeights[stack.peek()]) {
                    int height = extendedHeights[stack.pop()];
                    int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                    maxArea = Math.max(maxArea, height * width);
                }
                stack.push(i);
            }
            
            return maxArea;
        }
    
        public static void main(String[] args) {
            MaximalRectangle solution = new MaximalRectangle();
            char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
            };
            System.out.println(solution.maximalRectangle(matrix));  // Output: 6
        }
    }
    
