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
    int cnt=0;
    int ans=-1;
    void dfs_in(TreeNode root,int k){
        if(root==null) return;

        dfs_in(root.left,k);
        cnt++;

        if(cnt==k){
            ans=root.val;
        }
        dfs_in(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        dfs_in(root,k);
        return ans;
       
    }
}