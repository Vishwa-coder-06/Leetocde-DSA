class Solution {
    long islandsum(int row,int col,int[][] grid){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0)
        return 0;

        long sum=grid[row][col];
        grid[row][col]=0;
        sum+=islandsum(row+1,col,grid);
        sum+=islandsum(row-1,col,grid);
        sum+=islandsum(row,col+1,grid);
        sum+=islandsum(row,col-1,grid);

        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int res=0;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    long sum=islandsum(i,j,grid);
                    if(sum%k==0) res++;
                }
            }
        }
        return res;
    }
}