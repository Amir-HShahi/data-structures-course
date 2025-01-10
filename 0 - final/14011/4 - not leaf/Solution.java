public class Solution {
    private int counter = 0;

    public int countNotLeaf(TreeNode root) {
        if (root == null)
            return counter;

        if (root.left != null || root.right != null) {
            counter++;
        }

        countNotLeaf(root.left);
        countNotLeaf(root.right);
        return counter;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}