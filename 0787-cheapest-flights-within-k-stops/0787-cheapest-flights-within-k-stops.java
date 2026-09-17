class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        HashMap<Integer,List<int[]>>adj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adj.put(i,new ArrayList<>());
        }
        for (int[] flight : flights) {
            adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        Queue<int[]>qu=new LinkedList<>();
        qu.offer(new int[]{src,0});

        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
       
        int stop=0;
        while(!qu.isEmpty() && stop<=k){
            int size=qu.size();
            for(int i=0;i<size;i++){
                int[] curr =qu.poll();
                int u=curr[0];
                int cost=curr[1];
                for(int[] nei:adj.get(u)){
                    int v=nei[0];
                    int price=nei[1];
                    if(cost+price<dist[v]){
                        dist[v]=cost+price;
                        qu.offer(new int[]{v,dist[v]});
                    }
                }
            }
            stop++;
        }
        return dist[dst]==Integer.MAX_VALUE?-1:dist[dst];
    }
}