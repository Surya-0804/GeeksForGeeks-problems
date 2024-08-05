class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        if(v.length%2==0){
            return (v[v.length/2 -1]+v[v.length/2])/2;
        }else{
            return v[v.length/2];
        }
    }
}
