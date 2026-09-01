class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,List<int[]>>adj=new HashMap<>();
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
         for(int i=1;i<=n;i++)
            adj.put(i,new ArrayList<>());
        
        for(int edge[]:times)
            adj.get(edge[0]).add(new int[]{edge[1],edge[2]});
        
        PriorityQueue<int[]>pq =new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{k,0});
        dist[k]=0;

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            for(int[] nbr:adj.get(curr[0])){
                int newDist=nbr[1]+curr[1];
                if(newDist<dist[nbr[0]]){
                    pq.offer(new int[]{nbr[0],newDist});
                    dist[nbr[0]]=newDist;
                }
            }
        }
        int ans=0;
        for(int i=1;i<n+1;i++){
            if(dist[i]==Integer.MAX_VALUE) return-1;
            ans=Math.max(ans,dist[i]);
        }
        return ans;
        
    }
}