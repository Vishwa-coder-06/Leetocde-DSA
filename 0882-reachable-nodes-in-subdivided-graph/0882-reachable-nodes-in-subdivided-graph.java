class Solution {
    public int reachableNodes(int[][] edges, int maxMoves, int n) {
        HashMap<Integer,List<int[]>> adjlist=new HashMap<>();
        for(int i=0;i<n;i++){
            adjlist.put(i,new ArrayList<>() );
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            adjlist.get(u).add(new int[]{v,w});
            adjlist.get(v).add(new int[]{u,w});
        }

        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        pq.offer(new int[]{0,0});

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int u=curr[0];
            int cost=curr[1];
            if(cost>dist[u]) continue;
            for(int[] neighbor:adjlist.get(u)){
                int v=neighbor[0];
                int newcost=neighbor[1]+1;
                if(dist[u]+newcost<dist[v]){
                    dist[v]=dist[u]+newcost;
                    pq.offer(new int[]{v,dist[v]});
                }
            }
        }
        int reach=0;
        for(int i=0;i<n;i++){
            if(dist[i]<=maxMoves){
                reach++;
            }
        }
        for(int[] edge:edges){
            int u=edge[0],v=edge[1],w=edge[2];
            int reachfromU=dist[u]<=maxMoves?Math.max(0,maxMoves-dist[u]):0;
            int reachfromV=dist[v]<=maxMoves?Math.max(0,maxMoves-dist[v]):0;

            reach+=Math.min(w,reachfromU+reachfromV);
        }
        return reach;
    }
}