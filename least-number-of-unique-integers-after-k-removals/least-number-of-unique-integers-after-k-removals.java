class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int n : arr){
            count.put(n, count.getOrDefault(n,0) +1);
        }
        
        List<Integer> lst = new ArrayList<Integer>(count.values());
        Collections.sort(lst);
        
        int index = 0;
        while (index < lst.size() && k > 0) {
            int value = lst.get(index);
            if (value > k) {
                break;
            } else {
                k -= value;
                index++;
            }
        }
        
        return count.size() - index;
        
    }
}