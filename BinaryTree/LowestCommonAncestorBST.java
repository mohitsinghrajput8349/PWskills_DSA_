package BinaryTree;
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class LowestCommonAncestorBST {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode x, TreeNode y) {
        if (root == null || x == null || y == null) {
            return null;
        }

        // If both x and y are smaller, LCA lies in the left subtree
        if (x.val < root.val && y.val < root.val) {
            return lowestCommonAncestor(root.left, x, y);
        }

        // If both x and y are greater, LCA lies in the right subtree
        if (x.val > root.val && y.val > root.val) {
            return lowestCommonAncestor(root.right, x, y);
        }

        // If one is smaller and the other is greater, or if one matches root, root is LCA
        return root;
    }

    public static void main(String[] args) {
        // Construct the BST
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(25);
        root.right.right = new TreeNode(35);

        // Given nodes
        TreeNode x1 = new TreeNode(6);
        TreeNode y1 = new TreeNode(12);
        TreeNode x2 = new TreeNode(10);
        TreeNode y2 = new TreeNode(12);
        TreeNode x3 = new TreeNode(20);
        TreeNode y3 = new TreeNode(6);
        TreeNode x4 = new TreeNode(18);
        TreeNode y4 = new TreeNode(22);
        TreeNode x5 = new TreeNode(30);
        TreeNode y5 = new TreeNode(30);

        // Find lowest common ancestor for given nodes
        System.out.println("LCA (6, 12): " + lowestCommonAncestor(root, x1, y1).val);
        System.out.println("LCA (10, 12): " + lowestCommonAncestor(root, x2, y2).val);
        System.out.println("LCA (20, 6): " + lowestCommonAncestor(root, x3, y3).val);
        System.out.println("LCA (18, 22): " + lowestCommonAncestor(root, x4, y4).val);
        System.out.println("LCA (30, 30): " + lowestCommonAncestor(root, x5, y5).val);
    }
}
