/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int ans = 0;
    public void dfs(TreeNode root, int val){
        if(root == null){
            return;
        }
        
        val *= 10;
        val += root.val;
        
        if(root.left ==null && root.right == null){
            ans += val;
            return;
        }
        
        dfs(root.left, val);
        dfs(root.right, val);
        
    }
    public int sumNumbers(TreeNode root) {
        
        
        dfs(root, 0);
        return ans;
    }
}