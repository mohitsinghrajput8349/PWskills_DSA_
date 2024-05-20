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

public class CheckCompleteBinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean encounteredNull = false;
        
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            
            if (currentNode == null) {
                encounteredNull = true;
            } else {
                if (encounteredNull) {
                    // If we have encountered a null node before and now we see a non-null node
                    return false;
                }
                queue.offer(currentNode.left);
                queue.offer(currentNode.right);
            }
        }
        
        return true;
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
        CheckCompleteBinaryTree treeChecker = new CheckCompleteBinaryTree();
        int arr[] = {1, 2, 3, 4, 5, 6};
        TreeNode root = treeChecker.insertLevelOrder(arr, null, 0);
        boolean isComplete = treeChecker.isCompleteTree(root);
        System.out.println(isComplete ? "Complete Binary Tree" : "Not a Complete Binary Tree");
    }
}
