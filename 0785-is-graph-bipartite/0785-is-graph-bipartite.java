class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        for(int i=0;i<n;i++){
            if(color[i]!=0) continue;
            Queue<Integer>qu=new LinkedList<>();
            qu.offer(i);
            color[i]=1;
            while(!qu.isEmpty()){
                int node=qu.poll();
                for(int neighbor:graph[node]){
                    if(color[neighbor] == color[node]) return false;
                    if(color[neighbor]==0){
                        color[neighbor]=-color[node];
                        qu.offer(neighbor);
                    }
                }
            }
        }
        return true;
    }
}