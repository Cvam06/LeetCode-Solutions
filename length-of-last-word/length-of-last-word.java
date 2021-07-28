class Solution {
    public int lengthOfLastWord(String s) {
        String[] arrOfStr = s.split(" ");
        if(arrOfStr.length > 0){
            return arrOfStr[arrOfStr.length - 1].length();    
        }
        return 0;
    }
}