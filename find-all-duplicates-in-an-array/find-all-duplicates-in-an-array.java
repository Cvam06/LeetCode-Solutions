class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<Integer>();
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i] && !res.contains(nums[i])){
                res.add(nums[i]);
                i+=1;
            }
        }
        return res;
    }
}