class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        
        List<String> result = new ArrayList<>();
        
        for(String word : words){
            for(int i = 0; i < board.length; i++){
                for(int j=0; j< board[i].length; j++){
                    if(board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word) && !result.contains(word)){
                        result.add(word);
                    }
                }
            }
        }
        
        return result;
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
}