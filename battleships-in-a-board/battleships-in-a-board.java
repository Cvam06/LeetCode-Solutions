class Solution {
    public int countBattleships(char[][] board) {
        int numberOfship = 0;
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                numberOfship += dfs(board, i, j);
            }
        }
        
        return numberOfship;
    }
    
    public int dfs(char[][] board, int i, int j){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '.'){
            return 0;
        }
        
        board[i][j] = '.';
        dfs(board, i+1, j);
        dfs(board, i-1, j);
        dfs(board, i, j+1);
        dfs(board, i, j-1);
        
        return 1;
    }
}