class Solution {
    public Map<Integer, Set<Integer>> buildGraph(int[][] edges){
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        
        for(int[] edge : edges){
            int from = edge[0];
            int to = edge[1];
            if(!graph.containsKey(from)){
                graph.put(from, new HashSet<>());
            }
            graph.get(from).add(to);
            if(!graph.containsKey(to)){
                graph.put(to, new HashSet<>());
            }
            graph.get(to).add(from);
        }
        
        return graph;
    }
    public void dfs(int idx, Set<Integer> visited, Map<Integer, Set<Integer>> graph) {
        if(visited.contains(idx)){
            return;
        }
        visited.add(idx);
        if(!graph.containsKey(idx)){
            return;
        }
        for(int neighbor: graph.get(idx)){
            dfs(neighbor, visited, graph);
        }
    }
    
    public int countComponents(int n, int[][] edges){
        Map<Integer, Set<Integer>> graph = buildGraph(edges);
        
        Set<Integer> visited = new HashSet<>();
        int connectedComponentCount = 0;
        
        for(int i = 0; i < n; i++){
            if(visited.contains(i)){
                continue;
            }
            dfs(i, visited, graph);
            connectedComponentCount+=1;
        }
        
        return connectedComponentCount;
    }
}