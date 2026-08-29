class Solution {
    void dfs(int node,int[][] mat,boolean[] visited){
        visited[node]=true;
        for(int nbr=0;nbr<mat.length;nbr++){
            if(mat[node][nbr]==1 && !visited[nbr])
            dfs(nbr,mat,visited);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                ans++;
                dfs(i,isConnected,visited);
            }
        }
        return ans;



    }
}