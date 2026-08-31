class Solution {
    boolean res=false;
    void dfs(int node,int src,HashMap<Integer,List<Integer>> adj,boolean[] visited){
        visited[node]=true;
        if(node == src) res=true;
        for(int nbr:adj.get(node)){
            if(!visited[nbr]) dfs(nbr,src,adj,visited);
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,List<Integer>> adj=new HashMap<>();
        for(int i=0;i<n;i++){
            adj.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited=new boolean[n];
        dfs(source,destination,adj,visited);
        return res;
        
    }
}