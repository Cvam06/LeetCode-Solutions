class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0){
            return 0;
        }
        int[] left = new int[n];
        int[] right = new int[n];
        
        int leftMin = prices[0];
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1],prices[i]-leftMin);
            leftMin = Math.min(leftMin, prices[i]);
        }
        
        int rightMax = prices[n-1];
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], rightMax-prices[i]);
            rightMax = Math.max(rightMax, prices[i]);
        }
        
        int profit = right[0];
        for(int i=1; i<n; i++){
            profit = Math.max(profit, left[i-1]+right[i]);
        }
        
        return profit;
    }
}