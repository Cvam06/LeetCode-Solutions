class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
//         char[] sChar =s.toCharArray();
//         char[] tChar = t.toCharArray();
        
//         Arrays.sort(sChar);
//         Arrays.sort(tChar);
//         return Arrays.equals(sChar, tChar);
        
        char[] count = new char[26];
        for(int i = 0;  i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for(int i : count){
            if(i != 0){
                return false;
            }
        }
        
        return true;
    }
    
}