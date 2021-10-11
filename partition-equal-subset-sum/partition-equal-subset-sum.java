class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int num : nums){
            total = total + num;
        }
        // to be equal to both sets, the total needs to be even, odd can't be 2*x
        if(total%2!=0){
            return false;
        }
        
        return canPartition(nums, 0, 0, total, new HashMap<String, Boolean>());
    }
    
    public boolean canPartition(int[] nums, int index, int sum, int total, HashMap<String, Boolean> state){
        String current = index+""+sum;
        if(state.containsKey(current)){
            return state.get(current);
        }
        if(total/2 == sum){
            return true;
        } 
        if(sum > total/2 || index >= nums.length){
            return false;
        }
        
        boolean val = canPartition(nums, index+1, sum, total, state) || canPartition(nums, index+1, sum+nums[index], total, state);
        state.put(current, val);
        return val;
    }
    
    
}