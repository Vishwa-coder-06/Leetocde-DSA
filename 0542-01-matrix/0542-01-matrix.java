class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Queue<int[]>qu=new LinkedList<>();
        int[][] dist =new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    dist[i][j]=0;
                    qu.offer(new int[]{i,j});
                }
                else dist[i][j]=-1;
            }
        }
        int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
        while(!qu.isEmpty()){
            int[] curr=qu.poll();
            int r=curr[0];
            int c=curr[1];
            for(int[] dir:direction){
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr>=0 && nr<m && nc>=0 && nc<n && dist[nr][nc]==-1){
                    dist[nr][nc]=dist[r][c]+1;
                    qu.offer(new int[]{nr,nc});
                }
            }
        }
        return dist;
    }
}