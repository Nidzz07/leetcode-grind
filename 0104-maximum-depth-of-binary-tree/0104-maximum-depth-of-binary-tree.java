class Solution {
    public int maxDepth(TreeNode root) {
        
        // empty tree
        if (root == null)
            return 0;

        // find depth of left and right subtree
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // return maximum depth
        return 1 + Math.max(leftDepth, rightDepth);
    }
}