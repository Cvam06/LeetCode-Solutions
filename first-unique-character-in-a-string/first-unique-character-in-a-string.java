class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        char[] sChar = s.toCharArray();
        
        for(char t : sChar){
            map.put(t, map.getOrDefault(t,0)+1);
        }
        
        for(int i = 0; i<sChar.length; i++){
            if(map.get(sChar[i]) == 1){
                return i;
            }
        }
        
        return -1;
    }
}