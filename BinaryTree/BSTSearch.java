package BinaryTree;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BSTSearch {
    public static boolean search(TreeNode root, int target) {
        while (root != null) {
            if (target == root.val) {
                return true; // Element found
            } else if (target < root.val) {
                root = root.left; // Move to the left subtree
            } else {
                root = root.right; // Move to the right subtree
            }
        }
        return false; // Element not found
    }

    public static void main(String[] args) {
        // Construct the sample BST
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);

        // Search for an element in the BST
        int target = 25;
        boolean found = search(root, target);
        
        // Display the search result
        if (found) {
            System.out.println("Element " + target + " found in the BST.");
        } else {
            System.out.println("Element " + target + " not found in the BST.");
        }
    }
}
