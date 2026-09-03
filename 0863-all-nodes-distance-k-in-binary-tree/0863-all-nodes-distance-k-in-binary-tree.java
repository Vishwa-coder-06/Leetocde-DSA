/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode,TreeNode>mp=new HashMap<>();
    void dfs(TreeNode root){
        if(root == null)return;
        if(root.left!=null)
        mp.put(root.left,root);
        if(root.right!=null)
        mp.put(root.right,root);
        dfs(root.left);
        dfs(root.right);
    }
    void bfs(TreeNode root,List<Integer>ans,int k){
        Queue<TreeNode>q=new LinkedList<>();
        HashSet<TreeNode>st= new HashSet<>();
        int distance=0;
        q.offer(root);
        st.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            if(distance==k){
                while(!q.isEmpty()){
                    ans.add(q.poll().val);
                }
                return;
            }
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null && !st.contains(curr.left)){
                    st.add(curr.left);
                    q.offer(curr.left);
                }
                if(curr.right!=null && !st.contains(curr.right)){
                    st.add(curr.right);
                    q.offer(curr.right);
                }
                TreeNode parent=mp.get(curr);
                if(parent!=null && !st.contains(parent)){
                    st.add(parent);
                    q.offer(parent);
                }
            }
            distance++;
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer>ans=new ArrayList<>();
        dfs(root);
        bfs(target,ans,k);
        return ans;
    }
}