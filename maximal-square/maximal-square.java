class Solution {
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int largest = 0;
        
        int[][] dp = new int[rows+1][cols+1];
        // for(int i=0; i<=rows; i++){
        //     for(int j=0; j<=cols; j++){
        //         if(i==0 || j==0){
        //             dp[i][j] = 0;
        //         }
        //     }
        // }
        
        for(int i=0; i<=rows; i++){
            for(int j=0; j<=cols; j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if(matrix[i-1][j-1] == '1'){
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                    if(largest < dp[i][j]){
                        largest = dp[i][j];
                    }
                }
            }
        }
        
        
        return largest*largest;
    }
}