class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        // both nodes are null
        if (p == null && q == null)
            return true;

        // one node is null or values differ
        if (p == null || q == null || p.val != q.val)
            return false;

        // check left and right subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}