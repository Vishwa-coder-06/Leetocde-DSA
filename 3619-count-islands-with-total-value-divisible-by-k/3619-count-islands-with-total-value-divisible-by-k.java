class Solution {
    long islandsum(int row,int col,int[][] grid,boolean[][] visited){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || visited[row][col] || grid[row][col]==0)
        return 0;

        visited[row][col]=true;
        long sum=grid[row][col];
        sum+=islandsum(row+1,col,grid,visited);
        sum+=islandsum(row-1,col,grid,visited);
        sum+=islandsum(row,col+1,grid,visited);
        sum+=islandsum(row,col-1,grid,visited);

        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int res=0;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]>0){
                    long sum=islandsum(i,j,grid,visited);
                    if(sum%k==0) res++;
                }
            }
        }
        return res;
    }
}