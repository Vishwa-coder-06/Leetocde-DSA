class Solution {
    public int maxDistance(int[][] grid) {
        int n=grid.length;
        Queue<int[]>qu=new LinkedList<>();
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                if(grid[r][c]==1)
                qu.offer(new int[]{r,c});
            }
        }

        if(qu.isEmpty() || qu.size()==n*n){
            return -1;
        }

        int distance=-1;
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
        while(!qu.isEmpty()){
            int size=qu.size();
            distance++;
            while(size-->0){
                int[] curr=qu.poll();
                int r=curr[0];
                int c=curr[1];

                for(int[] dir:directions){
                    int nr=r+dir[0];
                    int nc=c+dir[1];
                    if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]==0){
                        grid[nr][nc]=1;
                        qu.offer(new int[]{nr,nc});
                    }
                }
            }
        }
        return distance;
        
    }
}