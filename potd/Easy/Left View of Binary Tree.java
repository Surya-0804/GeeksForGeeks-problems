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
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    static int h;

    ArrayList<Integer> leftView(Node root)
    {
        // Your code here
        h = 0;
        ArrayList<Integer> list = new ArrayList<>();
        solve(list,root);
        return list;
    }
    public static void solve(ArrayList<Integer> list,Node root){
        if(root == null){
            return;
        }
        if(h>= list.size()){
            list.add(root.data);
        }
        h++;
        solve(list,root.left);
        solve(list,root.right);
        h--;
    }
}
