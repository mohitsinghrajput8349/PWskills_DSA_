package Trees;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class SpiralOrderTraversal {
    public List<Integer> spiralOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        // Two stacks to store the levels
        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();
        
        currentLevel.push(root);
        boolean leftToRight = true;
        
        while (!currentLevel.isEmpty()) {
            TreeNode node = currentLevel.pop();
            result.add(node.val);
            
            if (leftToRight) {
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
                if (node.right != null) {
                    nextLevel.push(node.right);
                }
            } else {
                if (node.right != null) {
                    nextLevel.push(node.right);
                }
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
            }
            
            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<TreeNode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
        
        return result;
    }

    
    public TreeNode insertLevelOrder(int[] arr, TreeNode root, int i) {
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    public static void main(String[] args) {
        SpiralOrderTraversal tree = new SpiralOrderTraversal();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        TreeNode root = tree.insertLevelOrder(arr, null, 0);
        List<Integer> result = tree.spiralOrderTraversal(root);
        System.out.println(result); // Output: [1, 3, 2, 4, 5, 6, 8, 7]
    }
}
