class Solution {
    static void backtrack(int col, int n, 
                         HashSet<Integer>rowSet,
                         HashSet<Integer>colSet,
                         HashSet<Integer>ldSet,
                         HashSet<Integer>rdSet,
                         List<List<String>>res,
                         List<String>board){
       if(col==n){
        res.add(new ArrayList<>(board));
        return ;
       }

       for(int row=0;row<n;row++){
        if(!(rowSet.contains(row) || 
            colSet.contains(col) ||
            ldSet.contains(row+col) ||
            rdSet.contains(row-col)  )){
                char[] sol=new char[n];
                Arrays.fill(sol,'.');
                sol[row]='Q';
                board.add(new String(sol));

                rowSet.add(row);
                colSet.add(col);
                ldSet.add(row+col);
                rdSet.add(row-col);

                backtrack(col+1,n,rowSet,colSet,ldSet,rdSet,res,board);
                board.remove(board.size()-1);
                
                rowSet.remove(row);
                colSet.remove(col);
                ldSet.remove(row+col);
                rdSet.remove(row-col);
            }

       }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>res=new ArrayList<>();
        List<String>board=new ArrayList<>();

        backtrack(0,n,new HashSet<>(),new HashSet<>(),new HashSet<>(),new HashSet<>(),res,board);
        return res;
        
    }
}