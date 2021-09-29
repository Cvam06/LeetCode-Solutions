class Solution {
    public int trap(int[] height) {
        int left = 1;
        int right = height.length-2;
        int maxLeft = height[0];
        int maxRight = height[height.length - 1];
        int trappedWater = 0;
        
        while(left <= right){
            if(maxLeft <= maxRight){
                if(maxLeft < height[left]){
                    maxLeft = height[left];
                } else{
                    trappedWater += maxLeft - height[left];
                }
                left += 1;
            } else{
                if(maxRight < height[right]){
                    maxRight = height[right];
                } else{
                    trappedWater += maxRight - height[right];
                }
                right -= 1;
            }
        }
        return trappedWater;
    }
}