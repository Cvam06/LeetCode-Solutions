class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<n; i++){
            if(s.empty()){
                left[i] = 0;
                s.push(i);
            }else{
                while(!s.empty() && heights[s.peek()]>heights[i]){
                    s.pop();
                }
                left[i] = s.empty() ? 0 : s.peek()+1;
                s.push(i);
            }
        }
        while(!s.empty()){
            s.pop();
        }
        
        for(int i=n-1; i>=0; i--){
            if(s.empty()){
                right[i] = n-1;
                s.push(i);
            }
            else{
                while(!s.empty() && heights[s.peek()]>=heights[i]){
                    s.pop();
                }
                right[i] = s.empty() ? n-1 : s.peek()-1;
                s.push(i);
            }
        }
        
        int max_area = 0;
        for(int i=0; i<n;i++){
            
            max_area = Math.max(max_area, heights[i]*(right[i]-left[i]+1));
        }
        return max_area;
    } 
}