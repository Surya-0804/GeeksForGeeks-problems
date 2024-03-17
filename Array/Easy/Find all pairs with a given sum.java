
/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        Arrays.sort(A);
        HashSet<Long> set=new HashSet<>();
        ArrayList<pair> list=new ArrayList<>();
        for(long i : B){
            set.add(i);
        }
        
        for(long i : A){
            if(set.contains(X-i)){
                list.add(new pair(i,X-i));
            }
        }
        pair[] result=new pair[list.size()];
        for(int i=0;i<list.size();i++){
            pair p=list.get(i);
            result[i]=new pair(p.first,p.second);
        }
        return result;
    }
}
