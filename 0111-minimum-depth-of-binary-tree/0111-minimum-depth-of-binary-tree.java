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
    int minDepth;
    void dfs(TreeNode root,int depth){
        if(root == null) return;
        depth++;
        if(root.left==null && root.right==null){
            minDepth=Math.min(minDepth,depth);
            return;
        }
        if(depth>=minDepth) return;
        dfs(root.left,depth);
        dfs(root.right,depth);
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        minDepth=Integer.MAX_VALUE;
        dfs(root,0);
        return minDepth;
        
    }
}