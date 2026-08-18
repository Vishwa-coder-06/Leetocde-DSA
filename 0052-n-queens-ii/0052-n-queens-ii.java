class Solution {
     static int backtrack(int col, int n, 
                        boolean[] rows,boolean[] ldiag,boolean[] rdiag){
       if(col==n){
            return 1;
       }
       int count=0;
       for(int row=0;row<n;row++){
        int lInd=row+col;
        int rInd =row-col + n-1;

        if(!(rows[row] || ldiag[lInd] || rdiag[rInd])){
        rows[row]=true;
        ldiag[lInd]=true;
        rdiag[rInd]=true;

        count+=backtrack(col+1,n,rows,ldiag,rdiag);
        rows[row]=false;
        ldiag[lInd]=false;
        rdiag[rInd]=false;
         }
       }
       return count;
    }
    public int totalNQueens(int n) {
        boolean[] rows=new boolean[n];
        boolean[] ldiag=new boolean[2*n];
        boolean[] rdiag=new boolean[2*n];
       return backtrack(0,n,rows,ldiag,rdiag);
    }
}
