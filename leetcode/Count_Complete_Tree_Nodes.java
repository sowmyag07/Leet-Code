class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = 0;
        TreeNode l = root;
        while (l != null) {
            leftDepth++;
            l = l.left;
        }

        int rightDepth = 0;
        TreeNode r = root;
        while (r != null) {
            rightDepth++;
            r = r.right;
        }

        if (leftDepth == rightDepth) {
            return (1 << leftDepth) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}