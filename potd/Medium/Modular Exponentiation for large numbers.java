class Solution
{
    public long PowMod(long x, long n, long m)
    {
        // Code here
        if(n==0)
            return 1;
        if(n%2==0)
            return PowMod((x%m * x%m)%m , n/2 , m);
        return (x%m *PowMod(x,n-1,m)%m)%m;
    }
}
