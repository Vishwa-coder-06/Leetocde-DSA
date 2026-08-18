class Solution {
    static boolean recur(int r,int c,int ind,boolean[][] visited,char[][] board,String word){
        if(ind == word.length()) return true;

        if(r<0 || r>=board.length || c<0 || c>=board[0].length || visited[r][c] || board[r][c]!=word.charAt(ind)) return false;

        visited[r][c]=true;
        if(recur(r+1,c,ind +1,visited,board,word) ||
        recur(r,c+1,ind+1,visited,board,word) ||
        recur(r-1,c,ind+1,visited,board,word) ||
        recur(r,c-1,ind+1,visited,board,word) ) return true;

        visited[r][c]=false;
        return false;

    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean [][] visited=new boolean[m][n];
        boolean res=false;

        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(board[r][c] == word.charAt(0)){
                res=recur(r,c,0,visited,board,word);
                if(res) return true;
                }
            }
        }
        return false;
        
    }
}