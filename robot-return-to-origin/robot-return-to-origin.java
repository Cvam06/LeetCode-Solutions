class Solution {
    public boolean judgeCircle(String moves) {
        int UD = 0;
        int LR = 0;
        
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                UD+=1;
            } else if(moves.charAt(i) == 'D'){
                UD-=1;
            } else if(moves.charAt(i) == 'L'){
                LR+=1;
            } else if(moves.charAt(i) == 'R'){
                LR-=1;
            }
        }
        
        return UD == 0 && LR == 0;
    }
}