class Solution(object):
    def minCost(self, costs):
        """
        :type costs: List[List[int]]
        :rtype: int
        """
        if(len(costs) > 1):
            for i in range(1, len(costs)):
                costs[i][0] += min(costs[i-1][1], costs[i-1][2])
                costs[i][1] += min(costs[i-1][0], costs[i-1][2])
                costs[i][2] += min(costs[i-1][0], costs[i-1][1])
                
        return min(costs[len(costs)-1][0], costs[len(costs)-1][1], costs[len(costs)-1][2])
        