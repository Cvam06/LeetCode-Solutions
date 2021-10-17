class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransom = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        Arrays.sort(ransom);
        Arrays.sort(mag);
        
        String ranSort = new String(ransom);
        String magSort = new String(mag);
        int index = 0;
        
        for(int i = 0; i<magSort.length(); i++){
            if(magSort.charAt(i) == ranSort.charAt(index)){
                index += 1;
            }
            if(index >= ranSort.length()){
                return true;
            }
        }
        
        return false;
    }
}