class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        int mid;
        
        while(left < right){
            mid = left+(right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                    left = mid+1;
            }else{
                right = mid-1;
            }
        }
        
        if(target > nums[left]){
            return left+1;
        }
        return left;
        
    }
}