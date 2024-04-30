//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> set=new HashSet<>();
        for(int i : a){
            if(!set.contains(i))
                set.add(i);
        }
        for(int i: b){
            if(!set.contains(i))
                set.add(i);
        }
        return set.size();
    }
}
