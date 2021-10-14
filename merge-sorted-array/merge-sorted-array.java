class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for (int i = 0; i < n; i++) {
        //     nums1[i + m] = nums2[i];
        // }
        // Arrays.sort(nums1);
        int insertIndex = nums1.length - 1;
        m--;
        n--;
        while(m >=0 && n>=0){
            if(nums1[m] >= nums2[n]){
                nums1[insertIndex] = nums1[m];
                insertIndex -= 1;
                m-=1;
            } else if(nums1[m] < nums2[n]){
                nums1[insertIndex] = nums2[n];
                insertIndex -= 1;
                n-=1;
            }
        }
        while(m >= 0){
            nums1[insertIndex] = nums1[m];
            insertIndex -= 1;
            m-=1;
        }
        while(n >= 0){
            nums1[insertIndex] = nums2[n];
            insertIndex -= 1;
            n-=1;
        }
    }
}