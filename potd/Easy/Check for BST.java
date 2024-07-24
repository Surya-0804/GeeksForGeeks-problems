class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
     boolean check(Node root,long MINVAL,long MAXVAL){
        if(root==null) {
            return true;
        }
        
        if(root.data>=MAXVAL || root.data<=MINVAL) {
            return false;
        }
        
        return check(root.left,MINVAL,root.data) && check(root.right,root.data,MAXVAL);
    }
}
