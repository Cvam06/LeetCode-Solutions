class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] visited = new boolean[n];
        
        //create adjacency list - graph  = {0:[1,2], 1:[0,2], 2:[0,1]}
        for (int[] edge: edges) {
            if (!graph.containsKey(edge[0])) {
                graph.put(edge[0], new ArrayList());
            }
            if (!graph.containsKey(edge[1])) {
                graph.put(edge[1], new ArrayList());
            }
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        return hasPath(graph, start, end, visited);
    }
    public boolean hasPath(Map<Integer, List<Integer>>  graph, int start, int end, boolean[] visited) {
        if (start == end) return true;
        if (visited[start]) return false;
        
        visited[start] = true;
        
        for (int neighbor: graph.get(start)) {
            if (hasPath(graph, neighbor, end, visited) == true) {
                return true;
            }
        }
        return false;
    }
}