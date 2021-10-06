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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }
        
        Stack<TreeNode> s = new Stack<TreeNode>();
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        TreeNode curr = root;
        
        while(s.size()>0 || curr != null){
            while(curr!=null){
                s.push(curr);
                curr = curr.left;    
            }
            
            curr = s.pop();
            System.out.print(curr.val + " ");
            arrList.add(curr.val);
            curr = curr.right;
        }
        
        
        return arrList.get(k-1);
    }
}