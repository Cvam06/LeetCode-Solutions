class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals == null || intervals.length == 0){
            return 0;
        }
        
        Arrays.sort(intervals, (a,b)-> a[0] - b[0]);
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> ((int[])a)[1] - ((int[])b)[1]);
        minHeap.add(intervals[0]);
        
        for(int i = 1; i< intervals.length; i++){
            int[] current = intervals[i];
            int[] earliest = minHeap.remove();
            if(current[0] >= earliest[1]){
                earliest[1] = current[1];
            } else{
                minHeap.add(current);
            }
            
            minHeap.add(earliest);
        }
        
        return minHeap.size();
    }
    
}