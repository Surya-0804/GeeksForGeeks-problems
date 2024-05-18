class Solution {
    public int findPeakElement(List<Integer> a) {
        // Code here
        for(int i=0; i<a.size()-1 ; i++){
            if(a.get(i)>a.get(i+1))
                return a.get(i);
        }
        return -1;
    }
}
