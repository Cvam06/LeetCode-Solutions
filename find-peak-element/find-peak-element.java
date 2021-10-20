class Solution {
    public int findPeakElement(int[] nums) {
//         int left = 0;
//         int right = nums.length - 1;
//         while(left < right){
//             int mid = left + (right - left) / 2;
//             if(nums[mid] < nums[mid+1]){
//                 left = mid + 1;
//             } else{
//                 right = mid;
//             }
//         }
        
//         return left;
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
    }
}