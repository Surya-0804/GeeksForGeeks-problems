//User function Template for Java

class Solution
{
    public int[] countOddEven(int[] arr, int n)
    {
        // Code here
        int[] oddEven =new int[2];
        for(int num : arr){
            if(num%2==0)
                oddEven[1]++;
            else
                oddEven[0]++;
        }
        return oddEven;
    }
}
