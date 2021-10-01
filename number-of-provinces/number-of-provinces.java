class Solution {
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> visited = new HashSet<Integer>();
        int res = 0;
        for(int i=0; i < isConnected.length; i++){
            if(visited.contains(i)){
                continue;
            }
            dfs(visited, isConnected, i);
            res += 1;
        }
        return res; 
    }
    
    public void dfs(Set<Integer> visited, int[][] isConnected, int i){
        if(visited.contains(i)){
            return;
        }
        
        visited.add(i);
        for(int j=0; j < isConnected.length; j++){
            if(isConnected[i][j] == 0){
                continue;
            }
            dfs(visited, isConnected, j);
        }
    }
}