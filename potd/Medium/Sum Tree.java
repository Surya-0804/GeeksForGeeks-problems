/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    boolean flag=true;
    boolean isSumTree(Node root) {
        // Your code here
        solve(root);
        return flag;
    }
    int solve(Node root){
        if(root==null){
            return 0;
        }
        if(root.left ==null && root.right==null){
            return root.data;
        }
        int left=solve(root.left);
        int right=solve(root.right);
        if(left+right!=root.data){
            flag=false;
        }
        return left+right+root.data;
    }
}
