class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        int index = 1;
        int prev = 0;
        int curr = 1;
        
        while(index < s.length()){
            if(s.charAt(index - 1) != s.charAt(index)){
                count+=Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }else{
                curr++;
            }
            index+=1;
        }
        
        return count+=Math.min(curr, prev);
    }
}