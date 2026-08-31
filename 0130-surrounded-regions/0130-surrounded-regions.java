class Solution {
    void dfs(int r,int c,char[][] board){
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c] != 'O')
        return;
        board[r][c] ='B';
        dfs(r-1,c,board);
        dfs(r+1,c,board);
        dfs(r,c-1,board);
        dfs(r,c+1,board);
    }
    public void solve(char[][] board) {
        if(board == null || board.length == 0)return;
        int n=board.length;
        int m=board[0].length;
        //first and last col
        for(int i=0;i<n;i++){
            if(board[i][0]=='O') dfs(i,0,board);
            if(board[i][m-1]=='O') dfs(i,m-1,board);
        }
        //first and last row
        for(int i=0;i<m;i++){
            if(board[0][i]=='O') dfs(0,i,board);
            if(board[n-1][i]=='O') dfs(n-1,i,board);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='B') board[i][j]='O';
            }
        }
        
    }
}