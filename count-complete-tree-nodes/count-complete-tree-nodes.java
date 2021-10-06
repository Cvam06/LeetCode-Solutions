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
    public int countNodes(TreeNode root) {
        // Complete binary tree is having number of nodes are 2^n -1
        if(root == null){
            return 0;
        }
        int leftLevel = 1;
        TreeNode l = root.left;
        while(l != null){
            l = l.left;
            leftLevel += 1;
        }
        
        int rightLevel = 1;
        TreeNode r = root.right;
        while(r != null){
            r = r.right;
            rightLevel += 1;
        }
        
        if(leftLevel == rightLevel){
            double pow = Math.pow(2, leftLevel);
            return (int)pow-1;
        }
        
        return 1+countNodes(root.left)+countNodes(root.right);
        
    }
}