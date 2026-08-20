class Solution {
    static boolean isValid(char[][] board,int row,int col,char ch){
        for(int k=0;k<9;k++){
            if(board[row][k] == ch)return false;
            if(board[k][col] == ch)return false;
            if(board[3*(row/3)+k/3][3*(col/3)+k%3]==ch) return false;
        }
        return true;
    }
    static boolean sudoku(char[][] board){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        if(isValid(board,row,col,ch)){
                           board[row][col]=ch;
                            if(sudoku(board)) 
                            return true;
                            board[row][col]='.';
                        }
                     }
                return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        sudoku(board);
    }
}