class Solution {
     static int backtrack(int col, int n, 
                         HashSet<Integer>rowSet,
                         HashSet<Integer>ldSet,
                         HashSet<Integer>rdSet){
       if(col==n){
            return 1;
       }
       int count=0;
       for(int row=0;row<n;row++){
        if(!(rowSet.contains(row) || 
             ldSet.contains(row+col) ||
             rdSet.contains(row-col)  )){
                rowSet.add(row);
                ldSet.add(row+col);
                rdSet.add(row-col);
                count+=backtrack(col+1,n,rowSet,ldSet,rdSet);
                rowSet.remove(row);
                ldSet.remove(row+col);
                rdSet.remove(row-col);
            }
       }
       return count;
    }
    public int totalNQueens(int n) {
       return backtrack(0,n,new HashSet<>(),new HashSet<>(),new HashSet<>());
    }
}
