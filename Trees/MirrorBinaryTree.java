package Trees;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class MirrorBinaryTree {
    public void convertToMirror(TreeNode root) {
        if (root == null) {
            return;
        }

        // Swap the left and right subtrees
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively convert left and right subtrees to mirror
        convertToMirror(root.left);
        convertToMirror(root.right);
    }

    public void printPreOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        // Print the root node
        System.out.print(root.val + " ");

        // Print the left subtree
        printPreOrder(root.left);

        // Print the right subtree
        printPreOrder(root.right);
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
        MirrorBinaryTree tree = new MirrorBinaryTree();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root = tree.insertLevelOrder(arr, null, 0);

        System.out.println("Original Tree (Pre-order):");
        tree.printPreOrder(root);
        System.out.println();

        tree.convertToMirror(root);

        System.out.println("Mirror Tree (Pre-order):");
        tree.printPreOrder(root);
    }
}
