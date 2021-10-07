class Solution {
    public int connectSticks(int[] sticks) {
        if(sticks.length < 2){
            return 0;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i = 0; i < sticks.length; i++){
            queue.add(sticks[i]);
        }
        int a = 0;
        while(queue.size()>1){
            int x = queue.poll();
            int y = queue.poll();
            queue.add(x+y);
            a = a + x + y;
        }
        
        
        return a ;
    }
}