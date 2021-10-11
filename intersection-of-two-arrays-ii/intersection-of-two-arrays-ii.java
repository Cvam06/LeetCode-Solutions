class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> aCount= new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> bCount= new HashMap<Integer, Integer>();
        
        for(int num : nums1){
            aCount.put(num, aCount.getOrDefault(num, 0) + 1); 
        }
        for(int num : nums2){
            bCount.put(num, bCount.getOrDefault(num, 0) + 1); 
        }
        aCount.forEach((k,v)->{
            System.out.println("k == "+k+" v === "+v);
        });
        bCount.forEach((k,v)->{
            System.out.println("k == "+k+" v === "+v);
        });
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        aCount.forEach((k,v)->{
            if(bCount.containsKey(k)){
                if(aCount.get(k) >= bCount.get(k)){
                    for(int i = 0; i<bCount.get(k); i++){
                        arrList.add(k);
                    }
                }
                else if(aCount.get(k) < bCount.get(k)){
                    for(int i = 0; i<aCount.get(k); i++){
                        arrList.add(k);
                    }
                }
            }
        });
        int list2[] = new int[arrList.size()];
        int index= 0;
        for(int n : arrList){
            list2[index] = n;
            index+=1;
        }
        return list2;
        
    }
}