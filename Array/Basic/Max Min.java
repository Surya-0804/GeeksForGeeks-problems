class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int num : A){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        return max+min;
    }
}
