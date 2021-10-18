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
    
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root.left == null || root.right == null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
//         boolean found = false;
        
//         int count = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            boolean siblings = false;
            boolean cousins = false;

            int nodesAtDepth = queue.size();

            for (int i = 0; i < nodesAtDepth; i++) {
                // FIFO
                TreeNode node = queue.remove();

                // Encountered the marker.
                // Siblings should be set to false as we are crossing the boundary.
                if (node == null) {
                    siblings = false;
                } else {
                    if (node.val == x || node.val == y) {
                        // Set both the siblings and cousins flag to true
                        // for a potential first sibling/cousin found.
                        if (!cousins) {
                            siblings = cousins = true;
                        } else {
                            // If the siblings flag is still true this means we are still
                            // within the siblings boundary and hence the nodes are not cousins.
                            return !siblings;
                        }
                    }

                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                    // Adding the null marker for the siblings
                    queue.add(null);
                }
            }
            // After the end of a level if `cousins` is set to true
            // This means we found only one node at this level
            if (cousins) return false;
        }
        return false;
//         while(!q.isEmpty()){
//             int size = q.size();
//             for(int i = 0; i < size; i++){
//                 TreeNode curr = q.poll();
//                 if(curr.val == x || curr.val == y){
//                     if(found ){
//                         return true;
//                     }
//                     found = true;
//                 }
//                 if(curr.left != null)
//                     q.add(curr.left);
//                 if(curr.right != null)
//                     q.add(curr.right);
//             }
//             found = false;            
//         }
        
//         return false;
    }
//     public int getHeight(TreeNode root, int parent, int val, int level){
//         if(root == null){
//             return 0;
//         }
//         if(root.val == val){
//             parent= root.val;
//             return level;
//         }
        
//         parent= root.val;
//         int left = getHeight(root.left, parent, val, level+1);
//         if(left != 0){
//             return left;
//         }
        
//         parent = root.val;
//         int right = getHeight(root.right, parent, val, level+1);
//         return right;
        
        
        
//     }
//     public boolean isCousins(TreeNode root, int x, int y) {
//         if(root.val == x || root.val == y){
//             return false;
//         }
        
//         int xParent = -1;
//         int xHeight = getHeight(root, xParent, x, 0);
        
//         int yParent = -1;
//         int yHeight = getHeight(root, yParent, y, 0);
        
//         if(xParent != yParent && xHeight == yHeight){
//             return true;
//         }
        
//         return false;
//     }
}