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
    List<Integer>arr=new ArrayList<>();
    void dfs_in(TreeNode root){
        if(root == null)return;

        dfs_in(root.left);
        arr.add(root.val);
        dfs_in(root.right);
    }
   
    TreeNode build(int l,int r){
        if(l>r)return null;
        int mid=r+(l-r)/2;
        TreeNode node=new TreeNode(arr.get(mid));
        node.left=build(l,mid-1);
        node.right=build(mid+1,r);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        dfs_in(root);
        return build(0,arr.size()-1);
    }
}