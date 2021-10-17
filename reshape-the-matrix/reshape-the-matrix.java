class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length * mat[0].length) != (r*c)) return mat;
        
        int[][] res = new int[r][c];
        int rIndex = 0;
        int cIndex = 0;
        
        for(int i = 0; i< mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                res[rIndex][cIndex] = mat[i][j];
                cIndex++;
                if(cIndex == c){
                    cIndex = 0;
                    rIndex++;
                }
            }
        }
        
        return res;
    }
}