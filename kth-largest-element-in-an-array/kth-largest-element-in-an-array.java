class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        
        for(int n : nums){
            minHeap.add(n);
            System.out.println("minHeap : "+minHeap.peek());
            if(minHeap.size() > k){
                System.out.println(minHeap.remove());
            }
        }
        
        return minHeap.remove();
    }
}