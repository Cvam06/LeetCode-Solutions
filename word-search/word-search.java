class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j=0; j< board[i].length; j++){
                if(board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, int i, int j, int count, String word){
        if(count == word.length()){
            return true;
        }
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)){
            return false;
        } 
        /*Making the current variable empty*/
        char temp = board[i][j];
        board[i][j] = " ".charAt(0);
        
        boolean found = dfs(board, i+1, j, count+1, word) ||
                        dfs(board, i-1, j, count+1, word) ||
                        dfs(board, i, j+1, count+1, word) ||
                        dfs(board, i, j-1, count+1, word);
        board[i][j] = temp;
        return found;
        
    }
    
//     public boolean exist(char[][] board, String word) {
//         for(int i = 0; i < board.length; i++){
//             for(int j=0; i < board[i].length; j++){
//                 if(board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0)){
//                     return true;
//                 }
//             }
//         }
        
//         return false;
//     }
    
//     public boolean dfs(char[][] board, String word, int i, int j, int count){
//         if(count == word.length()){
//             return true;
//         }
        
//         if( i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)){
//             return false;
//         }
        
//         char temp = board[i][j];
//         board[i][j] = " ".charAt(0);
        
//         boolean found = dfs(board, word, i+1, j, count+1) || 
//             dfs(board, word, i-1, j, count+1) || dfs(board, word, i, j+1, count+1) || dfs(board, word, i, j-1, count+1);
        
//         board[i][j] = temp;
//         return found;
//     }
}