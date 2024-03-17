/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int element:head1){
            set.add(element);
        }
        for(int element : head2){
            if(set.contains(x-element)){
                count++;
            }
        }
        return count;
    }
}
