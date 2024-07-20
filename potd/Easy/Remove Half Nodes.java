/*

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

*/

class Solution {
    // Return the root of the modified tree after removing all the half nodes.
    public Node help(Node node){
        if(node==null)return null;
          
        node.left=help(node.left);
        node.right=help(node.right);
            
        if(node.left==null && node.right==null) return node;
        else if(node.right==null) return node=node.left;
        else if(node.left==null)  return  node=node.right; 

        return node;
    }
    
    public Node RemoveHalfNodes(Node root) {
        Node ans=help(root);
        return ans;
    }

}
