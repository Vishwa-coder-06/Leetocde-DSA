class Solution {
    void dfs(int node,boolean[] visited,HashMap<Integer,List<Integer>>adj){
        visited[node]=true;
        for(int nbr:adj.get(node)){
            if(!visited[nbr]) dfs(nbr,visited,adj);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashMap<Integer,List<Integer>>adj=new HashMap<>();
        int n=rooms.size();
        for(int i=0;i<n;i++){
            adj.put(i,new ArrayList<>(rooms.get(i)));
        }
        boolean[] visited=new boolean[n];
        dfs(0,visited,adj);

        for(int i=0;i<n;i++){
            if(!visited[i])return false;
        }
       
        return true;
    }
}