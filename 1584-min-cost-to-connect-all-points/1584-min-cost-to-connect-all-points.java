class Solution {
    public int minCostConnectPoints(int[][] points) {
        HashMap<Integer,List<int[]>>adj=new HashMap<>();
        int v=points.length;
        for(int i=0;i<v;i++) adj.put(i,new ArrayList<>());

        for(int i=0;i<v;i++){
            for(int j=i+1;j<v;j++){
                int w=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
                adj.get(i).add(new int[] {j,w});
                adj.get(j).add(new int[] {i,w});
            }
        }
        int total=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        boolean[] visited=new boolean[v];
        pq.offer(new int[]{0,0});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int node=curr[0];
            int weight=curr[1];
            if(visited[node]) continue;
            visited[node]=true;
            total+=weight;
            for(int[] nbr:adj.get(node)){
                if(!visited[nbr[0]])
                pq.offer(new int[]{nbr[0],nbr[1]});
            }
        }
        return total;
    }
}