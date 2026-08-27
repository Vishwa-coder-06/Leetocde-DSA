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
    List<List<Integer>>res=new ArrayList<>();
    void dfs(TreeNode root,int target,List<Integer>path){
        if(root==null) return;
        target-=root.val;
        path.add(root.val);
        if(root.left==null && root.right==null){
            if(target==0) res.add(new ArrayList<>(path));

        }
        else{
            dfs(root.left,target,path);
            dfs(root.right,target,path);
        }
        path.remove(path.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum,new ArrayList<>());
        return res;
    }
}