class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length < 2){
            return intervals;
        }
        
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
        
        /*List because we don't know the length, so for dynamic size.*/
        List<int[]> res = new ArrayList();
        int[] current_interval = intervals[0];
        res.add(current_interval);
        
        for(int[] interval :  intervals){
            int curr_begin = current_interval[0];
            int curr_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            if(curr_end >= next_begin){
                current_interval[1] = Math.max(curr_end, next_end);
            } else{
                current_interval = interval;
                res.add(current_interval);
            }
        }
        
        return res.toArray(new int[res.size()][]);
    }
}