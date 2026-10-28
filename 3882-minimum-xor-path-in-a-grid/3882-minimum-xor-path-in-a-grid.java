class Solution {
    int ans;
    boolean[][][] visited;
    void dfs(int[][] grid,int row,int col,int m,int n,int xor){
        xor^=grid[row][col];
        if(visited[row][col][xor]) return;

        visited[row][col][xor]=true;
        if(row==m-1 && col==n-1){
            ans=Math.min(ans,xor);
            return;
        }
        if(row+1<m) dfs(grid,row+1,col,m,n,xor);
        if(col+1<n) dfs(grid,row,col+1,m,n,xor);

    }
    public int minCost(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        ans=Integer.MAX_VALUE;
        visited=new boolean[m][n][1024];
        dfs(grid,0,0,m,n,0);

        return ans;
    }
}