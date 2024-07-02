class Solution {
    public boolean compute(Node root) {
        
        Node current=root;
        StringBuilder s=new StringBuilder();
        while(current!=null){
            s.append(current.data);
            current=current.next;
        }
        StringBuilder sb=new StringBuilder(s).reverse();
        return s.toString().equals(sb.toString());
    }
}
