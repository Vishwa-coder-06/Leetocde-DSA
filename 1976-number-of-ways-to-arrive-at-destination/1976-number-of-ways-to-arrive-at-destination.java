class Solution {
    public int countPaths(int n, int[][] roads) {
        int MOD=1_000_000_007;
        HashMap<Integer,List<long[]>>adj=new HashMap<>();
        for(int i=0;i<n;i++){
           adj.put(i,new ArrayList<>());
        }
        for(int[] road:roads) {
            adj.get(road[0]).add(new long[] {road[1],road[2]});
            adj.get(road[1]).add(new long[] {road[0],road[2]});
        }
        long[] distance=new long[n];
        Arrays.fill(distance,Long.MAX_VALUE);
        distance[0]=0;

        long[] ways=new long[n];
        ways[0]=1;

        PriorityQueue<long[]>pq=new PriorityQueue<>((a,b)->Long.compare(a[1],b[1]));
        pq.offer(new long[] {0,0});

        while(!pq.isEmpty()){
            long[] curr=pq.poll();
            int u=(int) curr[0];
            long d=curr[1];
            if(d>distance[u]) continue;
            for(long[] nbr:adj.get(u)){
                int v=(int) nbr[0];
                long newDist=distance[u]+nbr[1];
                if(newDist<distance[v]){
                    distance[v]=newDist;
                    ways[v]=ways[u];
                    pq.offer(new long[] {v,newDist});
                }
                else if(newDist == distance[v]){
                    ways[v]=(ways[v]+ways[u])%MOD;
                }
            }
        }
    return (int) ways[n-1];
    }
}