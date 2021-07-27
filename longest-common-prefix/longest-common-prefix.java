class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String commonPref = strs[0];
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(commonPref) != 0){
                commonPref = commonPref.substring(0, commonPref.length() - 1);
            }
        }
        return commonPref;
    }
}