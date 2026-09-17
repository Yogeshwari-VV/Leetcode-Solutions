class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<board.length;i++){
            Arrays.fill(board[i], '.');
        }
        backtrack(board, 0, res);
        return res;
    }
    void backtrack(char[][] board, int row, List<List<String>> res){
        if(row==board.length){
            res.add(createBoard(board));
            return;
        }
        for(int col = 0;col<board.length;col++){
            if(!isSafe(board, row, col)){
                continue;
            }
            //place Q
            board[row][col] = 'Q';
            //Backtrack
            backtrack(board, row+1, res);
            //Replace Q with .
            board[row][col] = '.';
        }
    }
    boolean isSafe(char[][] board, int row, int col){
        //same column
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Upper-left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //Upper-right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
      return true;
    }
    List<String> createBoard(char[][] board){
        List<String> cur = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            cur.add(new String(board[i]));
        }
        return cur;
    }
}