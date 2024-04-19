class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
       
        ArrayList<Integer> missing=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<m;i++)
            set.add(b[i]);
          
        for(int i=0;i<n;i++){
            
            if(set.contains(a[i]))
                continue;
                
            else
                missing.add(a[i]);
                
        }
        return missing;
        
    }
}
