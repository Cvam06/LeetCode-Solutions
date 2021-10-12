class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int a = 0;
        int b = 0;
        List<int[]> tempRes = new ArrayList();
        
        while(a < firstList.length && b < secondList.length){
            int start = Math.max(firstList[a][0], secondList[b][0]);
            int end = Math.min(firstList[a][1], secondList[b][1]);
            
            if(start <= end){
                tempRes.add(new int[]{start, end});
            }
            
            if(firstList[a][1] < secondList[b][1]){
                a += 1;
            }else{
                b += 1;
            }
        }
        
        return tempRes.toArray(new int[tempRes.size()][]);
        
    }
}