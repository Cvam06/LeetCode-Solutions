class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0 ){ return true;}
        if(x < 0 || x % 10 == 0) {return false;}
        
        int reverse = 0;
        int original = x;
        int rem; 
        
        while(x > 0 ){
            rem = x % 10;
            x = x / 10;
            
            reverse = (reverse * 10) + rem;
        }
        
        if(reverse == original) {
            return true;
        }else{
            return false;
        }
     }
}