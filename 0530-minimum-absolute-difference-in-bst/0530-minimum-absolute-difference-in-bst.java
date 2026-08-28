/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int mini = Integer.MAX_VALUE;
    TreeNode pre = null;

    void dfs(TreeNode root) {
        if (root == null)
            return;

        dfs(root.left);
        if (pre != null)
            mini = Math.min(mini, root.val - pre.val);
        pre = root;
        dfs(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return mini;
    }
}