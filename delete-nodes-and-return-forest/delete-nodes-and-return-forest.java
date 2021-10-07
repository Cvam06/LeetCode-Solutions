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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> remaining = new ArrayList<>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<to_delete.length; i++){
            set.add(to_delete[i]);
        }
        removeNodes(root, set, remaining);
        if(!set.contains(root.val)){
            remaining.add(root);
        }
        return remaining;
        
    }
    
    public TreeNode removeNodes(TreeNode root, Set<Integer> set, List<TreeNode> remaining){
        if(root == null){
            return null;
        }
        
        root.left = removeNodes(root.left, set, remaining);
        root.right = removeNodes(root.right, set, remaining);
        
        if(set.contains(root.val)){
            if(root.left != null){
                remaining.add(root.left);
            }
            if(root.right != null){
                remaining.add(root.right);
            }
            
            return null;
        }
        return root;
    }
}