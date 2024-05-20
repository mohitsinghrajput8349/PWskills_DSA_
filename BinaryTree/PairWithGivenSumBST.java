package BinaryTree;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class PairWithGivenSumBST {
    public static boolean isPairPresent(TreeNode root, int targetSum) {
        // Create two stacks for inorder traversal
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        // Initialize current1 and current2 to point to the leftmost and rightmost nodes respectively
        TreeNode current1 = root, current2 = root;

        // Initialize done1 and done2 flags
        boolean done1 = false, done2 = false;

        int val1 = 0, val2 = 0;

        while (true) {
            // Inorder traversal from left to right
            while (!done1) {
                if (current1 != null) {
                    stack1.push(current1);
                    current1 = current1.left;
                } else {
                    if (stack1.isEmpty()) {
                        done1 = true;
                    } else {
                        current1 = stack1.pop();
                        val1 = current1.val;
                        current1 = current1.right;
                        done1 = true;
                    }
                }
            }

            // Inorder traversal from right to left
            while (!done2) {
                if (current2 != null) {
                    stack2.push(current2);
                    current2 = current2.right;
                } else {
                    if (stack2.isEmpty()) {
                        done2 = true;
                    } else {
                        current2 = stack2.pop();
                        val2 = current2.val;
                        current2 = current2.left;
                        done2 = true;
                    }
                }
            }

            // If we find a pair with the given sum, return true
            if (val1 != val2 && val1 + val2 == targetSum) {
                System.out.println("Pair found: (" + val1 + ", " + val2 + ")");
                return true;
            }

            // If the sum of the current pair is less than the target sum, move to the next pair
            else if (val1 + val2 < targetSum) {
                done1 = false;
            }

            // If the sum of the current pair is greater than the target sum, move to the previous pair
            else {
                done2 = false;
            }

            // If both stacks are empty, exit the loop
            if (stack1.isEmpty() && stack2.isEmpty()) {
                break;
            }
        }

        // If no pair with the given sum is found, return false
        return false;
    }

    public static void main(String[] args) {
        // Construct the BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(9);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(14);

        // Given sum
        int targetSum = 14;

        // Find pair with given sum in the BST
        if (!isPairPresent(root, targetSum)) {
            System.out.println("No pair found with sum " + targetSum + " in the BST.");
        }
    }
}
