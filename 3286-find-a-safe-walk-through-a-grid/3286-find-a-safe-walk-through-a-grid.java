class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m=grid.size();
        int n=grid.get(0).size();
        int[][] minCost=new int[m][n];
        for(int[] row:minCost) Arrays.fill(row,Integer.MAX_VALUE);
        int[][] direction={{0,1},{0,-1},{1,0},{-1,0}};

        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int start=grid.get(0).get(0);
        minCost[0][0]=start;
        pq.offer(new int[]{start,0,0});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int cost=curr[0];
            int r=curr[1];
            int c=curr[2];
            if(cost>minCost[r][c]) continue;

            if(r==m-1 && c==n-1){
                return health-cost >= 1;
            }
            for(int[] dir:direction){
                int nr=r+dir[0];
                int nc=c+dir[1];

                if(nr>=0 && nr<m && nc>=0 && nc<n){
                    int newCost=cost+grid.get(nr).get(nc);

                    if(newCost < minCost[nr][nc]){
                        minCost[nr][nc]=newCost;
                        pq.offer(new int[]{newCost,nr,nc});
                    }
                }
            }
        }
        return false;
    }
}