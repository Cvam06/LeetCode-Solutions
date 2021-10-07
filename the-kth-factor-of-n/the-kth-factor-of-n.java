class Solution {
    public int kthFactor(int n, int k) {
        Set<Integer> arrList = new HashSet<Integer>();
        
        for(int i=1; i<=n/2; i++){
            if(n % i == 0 && !arrList.contains(i)){
                arrList.add(i);
                int sec = n / i;
                if(!arrList.contains(sec)) arrList.add(sec);
            }
        }
        List<Integer> list = new ArrayList<Integer>(arrList);
        Collections.sort(list);
        
        if( k <= list.size()){
            return list.get(k-1);
        }
        return k == 1 ? n : -1;
    }
}