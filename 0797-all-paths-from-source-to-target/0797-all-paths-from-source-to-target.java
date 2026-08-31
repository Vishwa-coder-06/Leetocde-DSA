class Solution {
    List<List<Integer>> res=new ArrayList<>();
    void dfs(int node,int dst,int[][] graph,List<Integer>path){
        if(node == dst){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int nbr:graph[node]){
            path.add(nbr);
            dfs(nbr,dst,graph,path);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path=new ArrayList<>();
        path.add(0);
        int dst=graph.length-1;
        dfs(0,dst,graph,path);
        return res;
        
    }
}