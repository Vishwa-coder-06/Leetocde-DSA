class Solution {
    void dfs(int node,boolean[] visited,List<List<Integer>> rooms){
        visited[node]=true;
        for(int nbr:rooms.get(node)){
            if(!visited[nbr]) dfs(nbr,visited,rooms);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();

        boolean[] visited=new boolean[n];
        dfs(0,visited,rooms);

        for(int i=0;i<n;i++){
            if(!visited[i])return false;
        }
       
        return true;
    }
}