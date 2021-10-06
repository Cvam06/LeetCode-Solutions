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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        int curr = 0;
        
        return dfs(root, arr, curr);
    }
    
    public boolean dfs(TreeNode root, int[] arr, int curr){
        if(root == null ){
            return false;
        } else if(curr == arr.length){
            return false;
        } else if(root.val != arr[curr]){
            return false;
        } else if(root.left==null && root.right==null && curr == arr.length - 1){
            return true;
        }
        
        return (dfs(root.left, arr,  curr+1) || dfs(root.right, arr, curr+1));
    }
}