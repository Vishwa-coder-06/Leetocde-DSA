class Solution {
    public int minimumObstacles(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][] dist=new int[n][m];
        for(int[] row:dist){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        
        Deque<int[]> deque=new ArrayDeque<>();
        deque.offerFirst(new int[]{0,0});
        dist[0][0]=0;

        int[][] direction={{0,1},{0,-1},{1,0},{-1,0}};

        while(!deque.isEmpty()){
            int[] curr=deque.pollFirst();
            int r=curr[0];
            int c=curr[1];

            if(r==n-1 && c==m-1)return dist[r][c];

            for(int[] dir:direction){
                int nr=r+dir[0];
                int nc=c+dir[1];

                if(nr>=0 && nr<n && nc>=0 && nc<m){
                    int w=grid[nr][nc];
                    if(dist[r][c]+w < dist[nr][nc]){
                        dist[nr][nc]=dist[r][c]+w;

                        if(w==0) deque.offerFirst(new int[]{nr,nc});
                        else deque.offerLast(new int[]{nr,nc});

                    }
                }
            }
        }
        return dist[n-1][m-1];
    }
}