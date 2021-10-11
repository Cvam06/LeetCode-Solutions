class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int n : nums){
            if(map.containsKey(n)){
                return map.get(n);
            }
            map.put(n, true);
        }
        return false;
    }
}