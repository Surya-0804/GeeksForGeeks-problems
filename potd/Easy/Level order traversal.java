/*
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
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Node> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            Node removed=que.remove();
            result.add(removed.data);
            if(removed.left!=null){
                que.add(removed.left);
            }
            if(removed.right!=null){
                que.add(removed.right);
            }
        }
        return result;   
    }
}
