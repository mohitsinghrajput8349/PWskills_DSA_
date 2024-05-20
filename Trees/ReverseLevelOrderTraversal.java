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

public class ReverseLevelOrderTraversal {
    public List<Integer> reverseLevelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> levels = new Stack<>();
        
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelNodes = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                levelNodes.add(currentNode.val);
                
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            
            levels.push(levelNodes);
        }
        
        // Extract nodes from levels stack in reverse order
        while (!levels.isEmpty()) {
            result.addAll(levels.pop());
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
        ReverseLevelOrderTraversal tree = new ReverseLevelOrderTraversal();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        TreeNode root = tree.insertLevelOrder(arr, null, 0);
        List<Integer> result = tree.reverseLevelOrder(root);
        System.out.println(result); // Output: [7, 8, 4, 5, 6, 2, 3, 1]
    }
}
