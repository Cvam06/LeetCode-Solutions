class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> all = new HashSet<Integer>();
        for(int num :  nums1){
            all.add(num);
        }
        
        HashSet<Integer> intersection = new HashSet<Integer>();
        for(int n : nums2){
            if(all.contains(n)){
                intersection.add(n);
            }
        }
        
        int[] res = new int[intersection.size()];
        int index = 0;
        for(int i : intersection){
            res[index] = i;
            index += 1;
        }
        
        return res;
    }
}