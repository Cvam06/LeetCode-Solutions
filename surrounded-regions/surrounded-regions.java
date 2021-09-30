class Solution {
    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0 ){
            return;
        }
        int rows = board.length;
        int cols = board[0].length;
        
        for(int i=0; i<cols; i++){
            if(board[0][i] == 'O'){boundryDfs(board, 0, i);}
            if(board[rows-1][i] == 'O'){boundryDfs(board, rows-1, i);}
        }
        
        for(int j=0; j<rows; j++){
            if(board[j][0] == 'O'){boundryDfs(board, j, 0);}
            if(board[j][cols-1] == 'O'){boundryDfs(board, j, cols-1);}
        }
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                } else if(board[i][j]=='*'){
                    board[i][j]='O';
                }
            }
        }
    }
    
    public void boundryDfs(char[][] board, int i, int j){
        if(i < 0 || i >= board.length || j < 0 || j > board[0].length || board[i][j] == 'X') return;
        
        if(board[i][j] == 'O') board[i][j]='*';
        
        if(i>0 && board[i-1][j] == 'O'){
            boundryDfs(board, i-1, j);
        }
        
        if(i<board.length - 1 && board[i+1][j] == 'O'){
            boundryDfs(board, i+1, j);
        }
        
        if(j>0 && board[i][j-1] == 'O'){
            boundryDfs(board, i, j-1);
        }
        
        if(j<board[i].length-1 && board[i][j+1] == 'O'){
            boundryDfs(board, i, j+1);
        }
        
        return;
    }
    
    
}