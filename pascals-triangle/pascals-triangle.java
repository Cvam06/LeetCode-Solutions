class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int rowNum = 0;
        
        while(rowNum < numRows){
            List<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j <= rowNum; j++){
                if(j == 0 || j == rowNum){
                    temp.add(1);
                } else{
                    temp.add(result.get(rowNum - 1).get(j-1) + result.get(rowNum - 1).get(j));
                }
            }
            result.add(temp);
            rowNum +=1;
        }
        
        return result;
     }
}