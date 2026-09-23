class Solution {
    int dijkstra(int start,int n,HashMap<Integer,List<int[]>>adj,int threshold){
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start]=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{start,0});

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int u=curr[0];
            int d=curr[1];
            if(d>dist[u]) continue;

            for(int[] neighbor:adj.get(u)){
                int v=neighbor[0];
                int weight=neighbor[1];

                if(dist[u]+weight<dist[v]){
                    dist[v]=dist[u]+weight;
                    pq.offer(new int[]{v,dist[v]});
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(i!=start && dist[i]<=threshold)count++;
        }
        return count;
    }
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        HashMap<Integer,List<int[]>>adj=new HashMap<>();
        for(int i=0;i<n;i++) adj.put(i,new ArrayList<>());

        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        int minReach=Integer.MAX_VALUE;
        int bestcity=-1;
        for(int i=0;i<n;i++){
            int reach=dijkstra(i,n,adj,distanceThreshold);

            if(reach<=minReach){
                minReach=reach;
                bestcity=i;
            }
        }

        return bestcity;
    }
}