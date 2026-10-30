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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int n=q.size();
            boolean hasx=false;
            boolean hasy=false;
            while(n-->0){
            TreeNode curr=q.poll();
            if(curr.left!=null && curr.right!=null){
                if((curr.left.val==x && curr.right.val==y) || (curr.left.val==y && curr.right.val==x)) return false;
            }
            if(curr.val==x) hasx=true;
            if(curr.val==y) hasy=true;

            if(curr.left!=null) q.offer(curr.left);
            if(curr.right!=null) q.offer(curr.right);
            }
            if(hasx && hasy) return true;
            if(hasx || hasy) return false;
        }
        return false;
        
    }
}