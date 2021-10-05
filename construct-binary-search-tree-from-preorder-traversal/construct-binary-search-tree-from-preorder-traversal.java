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
    public TreeNode getNewNode(int val){
        TreeNode newNode = new TreeNode(val);
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }
    
    public int construct_BST(int[] preorder, int n, int pos, TreeNode curr, int left, int right){
        if(pos == n || preorder[pos] < left || preorder[pos] > right){
            return pos;
        }
        
        if(preorder[pos] < curr.val){
            curr.left = getNewNode(preorder[pos]);
            pos += 1;
            pos = construct_BST(preorder, n, pos, curr.left, left, curr.val-1);
        }
        
        if(pos == n || preorder[pos] < left || preorder[pos] > right){
            return pos;
        }
        
        curr.right = getNewNode(preorder[pos]);
        pos += 1;
        pos = construct_BST(preorder, n, pos, curr.right, curr.val+1, right);
        return pos;
    }
    
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        if(n == 0){
            return null;
        }
        
        TreeNode treeNode = getNewNode(preorder[0]);
        if(n == 1){
            return treeNode;
        }
        
        construct_BST(preorder, n, 1, treeNode, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return treeNode;
    }
}