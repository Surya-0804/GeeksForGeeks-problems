class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int result=Integer.MAX_VALUE;
        for(int i=0; i<=n-m; i++){
            int answer=a.get(i+m-1)-a.get(i);
            result=Math.min(answer,result);
        }
        return result;
    }
}
