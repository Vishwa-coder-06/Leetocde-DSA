class Solution {
    int dfs(int row,int col,int[][] grid,boolean[][] visited){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0 || visited[row][col]) 
        return 0;
        visited[row][col]=true;
        return 1+dfs(row-1,col,grid,visited)
                +dfs(row+1,col,grid,visited)
                +dfs(row,col-1,grid,visited)
                +dfs(row,col+1,grid,visited);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                maxArea=Math.max(maxArea,dfs(i,j,grid,visited));
            }
        }
        return maxArea;
        
    }
}