package BinaryTree;
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class InorderPredecessorBST {
    private static TreeNode predecessor = null;

    public static TreeNode inorderPredecessor(TreeNode root, int key) {
        // Reset predecessor before each traversal
        predecessor = null;
        return findPredecessor(root, key);
    }

    private static TreeNode findPredecessor(TreeNode root, int key) {
        if (root == null) {
            return predecessor;
        }

        // If key is found, the inorder predecessor will be the rightmost node in its left subtree
        if (root.val == key) {
            if (root.left != null) {
                TreeNode temp = root.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                predecessor = temp;
            }
            return predecessor;
        }

        // If key is less than the current node's value, move to the left subtree
        else if (key < root.val) {
            return findPredecessor(root.left, key);
        }

        // If key is greater than the current node's value, update predecessor and move to the right subtree
        else {
            predecessor = root;
            return findPredecessor(root.right, key);
        }
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

        // Given key
        int key = 12;

        // Find the inorder predecessor of the given key in the BST
        TreeNode predecessorNode = inorderPredecessor(root, key);

        if (predecessorNode != null) {
            System.out.println("The inorder predecessor of key " + key + " is: " + predecessorNode.val);
        } else {
            System.out.println("No inorder predecessor found for key " + key + " in the BST.");
        }
    }
}
