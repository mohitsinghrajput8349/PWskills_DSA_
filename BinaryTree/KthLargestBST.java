package BinaryTree;
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class KthLargestBST {
    private static int count = 0;
    private static int result = Integer.MIN_VALUE;

    public static int kthLargest(TreeNode root, int k) {
        count = 0; // Reset count before each traversal
        result = Integer.MIN_VALUE; // Reset result before each traversal
        reverseInOrderTraversal(root, k);
        return result;
    }

    private static void reverseInOrderTraversal(TreeNode root, int k) {
        if (root == null || count >= k) {
            return;
        }
        
        // Traverse the right subtree
        reverseInOrderTraversal(root.right, k);
        
        // Increment count and check if k'th largest node is found
        count++;
        if (count == k) {
            result = root.val;
            return;
        }
        
        // Traverse the left subtree
        reverseInOrderTraversal(root.left, k);
    }

    public static void main(String[] args) {
        // Construct the BST
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);

        int k = 2;
        int kthLargest = kthLargest(root, k);
        System.out.println("The " + k + "'th largest node in the BST is: " + kthLargest);
    }
}
