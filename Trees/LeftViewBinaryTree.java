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

public class LeftViewBinaryTree {
    public List<Integer> leftView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            
            // Add the leftmost node of the current level to the result
            result.add(queue.peek().val);
            
            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                
                // Add the left child to the queue if present
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                
                // Add the right child to the queue if present
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        
        return result;
    }

    // Helper method to build a tree from level order input
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
        LeftViewBinaryTree tree = new LeftViewBinaryTree();
        int arr[] = {1, 2, 5, 7};
        TreeNode root = tree.insertLevelOrder(arr, null, 0);
        List<Integer> result = tree.leftView(root);
        System.out.println(result); // Output: [1, 2, 5, 7]
    }
}

