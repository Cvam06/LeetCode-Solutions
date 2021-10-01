class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int rows = text1.length();
        int cols = text2.length();
        
        char[] text1Char = text1.toCharArray();
        char[] text2Char = text2.toCharArray();
        
        int[][] dp = new int[rows+1][cols+1];
        
        // for(int i = 0; i < cols ; i++ ){
        //     dp[0][i] = 0;
        // }
        // for(int j = 0; j < rows ; j++ ){
        //     dp[j][0] = 0;
        // }
        
        for(int i = 0; i <= rows; i++){
            for(int j=0; j <= cols; j++){
                if(i==0 || j == 0){
                    dp[i][j] = 0;
                    continue;
                }
                if(text1Char[i-1] == text2Char[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }        
        
        return dp[rows][cols];
    }
}