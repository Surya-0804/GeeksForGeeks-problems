class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Integer> stack=new Stack<>();
        long[] result=new long[n];
        Arrays.fill(result,-1);
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                result[stack.peek()]=arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        return result;
    } 
}
