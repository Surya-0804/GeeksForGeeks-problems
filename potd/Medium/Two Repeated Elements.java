
class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        // Your code here
        int [] answer=new int[2];
        int[] count=new int[n];
        
        int index=0;
        Arrays.fill(count,0);
        
        for(int i=0;i<n+2;i++){
            if(index==2)
                break;
                
            if(count[arr[i]-1]==1)
                answer[index++]=arr[i];
            else
                count[arr[i]-1]++;
                
        }
        
        return answer;
    }
    
}
