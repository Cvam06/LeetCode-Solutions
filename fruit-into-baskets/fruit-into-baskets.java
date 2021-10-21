class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits == null || fruits.length == 0){
            return 0;
        }
        
        int max = 1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int i = 0;
        int j = 0;
        while(j < fruits.length){
            if(map.size() <= 2){
                map.put(fruits[j], j++);
            }
            if(map.size() > 2){
                int min = fruits.length - 1;
                for(int val : map.values()){
                    min = Math.min(min, val);
                }
                
                i = min + 1;
                map.remove(fruits[min]);
            }
            
            max = Math.max(max, j-i);
        }
    
    return max;
    }
}