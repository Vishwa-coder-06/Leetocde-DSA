class Solution {
    int maxi=0;
    void goldpath(int r,int c,int[][] grid,int sum){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]==0) return;
        int gold=grid[r][c];
        sum+=gold;
        maxi=Math.max(maxi,sum);
        grid[r][c]=0;
        goldpath(r+1,c,grid,sum);
        goldpath(r-1,c,grid,sum);
        goldpath(r,c+1,grid,sum);
        goldpath(r,c-1,grid,sum);
        grid[r][c]=gold;
    }
    public int getMaximumGold(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0)
                    goldpath(i,j,grid,0);
            }
        }
        return maxi;
    }
}