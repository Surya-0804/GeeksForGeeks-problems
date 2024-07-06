class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0; i<n ; i++){
            sum+=arr[i];
            if(sum==0)
                return true;
            int rem = sum;
            if(map.containsKey(rem))
                return true;
            else
                map.put(sum,i);
        }
        return false;
    }
}
