class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] temp=new int[n][n];
        int[][] ans=new int[n][n];
        for(int r=0;r<n;r++){
            int shift=rowShift[r];
            for(int c=0;c<n;c++){
                int newcol=(c-shift+n)%n;
                temp[r][newcol]=grid[r][c];
            }
        }
        for(int c=0;c<n;c++){
            int shift=colShift[c];
            for(int r=0;r<n;r++){
                int newrow=(r-shift+n)%n;
                ans[newrow][c]=temp[r][c];
            }
        }
        return ans;
    }
}