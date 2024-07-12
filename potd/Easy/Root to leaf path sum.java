
/*
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        // Your code here
        int sum=0;
        return solve(root,target,sum);
    }
    
    boolean solve(Node root, int target, int sum){
        if(root==null)
            return false;
        sum+=root.data;
        if(root.left==null && root.right==null) return sum==target;
        return solve(root.left,target,sum) ||  solve(root.right,target,sum);
    }
}
