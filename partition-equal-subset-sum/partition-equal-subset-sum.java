class Solution {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        // to be equal to both sets, the total needs to be even, odd can't be 2*x
        if(sum%2!=0){
            return false;
        }
        
        boolean[][] dp = new boolean[nums.length+1][(sum/2)+1];
        
        for(int i=0; i<=nums.length; i++){
            for(int j=0; j<=(sum/2); j++){
                if(i==0 || j==0){
                    dp[i][j] = false;
                } else if(nums[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                } else if(nums[i-1] == j){
                    dp[i][j] = true;
                } else{
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[nums.length][sum/2];
    }
}