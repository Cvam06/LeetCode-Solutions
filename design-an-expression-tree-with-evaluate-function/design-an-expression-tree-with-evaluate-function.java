/**
 * This is the interface for the expression tree Node.
 * You should not remove it, and you can define some classes to implement it.
 */

abstract class Node {
    public abstract int evaluate();
    // define your fields here
};

class TreeNode extends Node{
    public TreeNode left;
    public TreeNode right;
    public String val;
    
    public TreeNode(String val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
    public TreeNode(TreeNode left, TreeNode right, String val){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    @Override
    public int evaluate() {
        return dfs(this);
    }
    
    public int dfs(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) {
            return Integer.parseInt(root.val);
        }
        int result = 0;
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        switch(root.val) {
            case "+":
                result = left + right;
                break;
            case "-":
                result = left - right;
                break;
            case "*":
                result = left * right;
                break;
            case "/":
                result = left / right;
                break;
        }
        System.out.println("Result === "+result);
        return result;
    }
}



/**
 * This is the TreeBuilder class.
 * You can treat it as the driver code that takes the postinfix input 
 * and returns the expression tree represnting it as a Node.
 */

class TreeBuilder {
    Node buildTree(String[] postfix) {
        Set<String> operations = new HashSet<String>(Arrays.asList("+", "-", "*", "/"));
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        for(String exp : postfix){
            if(!operations.contains(exp)){
                stack.push(new TreeNode(exp));
            }else{
                TreeNode right = stack.pop();
                TreeNode left = stack.pop();
                stack.push(new TreeNode(left, right, exp));
            }
        }
        
        return stack.pop();
    }
};


/**
 * Your TreeBuilder object will be instantiated and called as such:
 * TreeBuilder obj = new TreeBuilder();
 * Node expTree = obj.buildTree(postfix);
 * int ans = expTree.evaluate();
 */