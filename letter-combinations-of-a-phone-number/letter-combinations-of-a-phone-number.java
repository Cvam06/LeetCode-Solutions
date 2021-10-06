class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits.length() == 0 || digits == null){
            return res;
        }
        
        String[] mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        
        letterCombination(res, digits, "",  0,  mapping);
        return res;
    }
    
    public void letterCombination(List<String> res, String digits, String currentCombo, int curr, String[] mapping){
        if(curr >= digits.length()){
            res.add(currentCombo);
            return;
        }
        String letters = mapping[digits.charAt(curr) - '0'];
        for(int i=0; i<letters.length(); i++){
            letterCombination(res, digits, currentCombo + letters.charAt(i), curr+1, mapping);
        }
        
    }
}