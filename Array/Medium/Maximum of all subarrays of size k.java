class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> result=new ArrayList<>();
        Deque<Integer> queue=new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!queue.isEmpty() && arr[i]>=arr[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
        }
        result.add(arr[queue.peekFirst()]);
        for(int i=k;i<n;i++){
            if(!queue.isEmpty() && queue.peekFirst()<=i-k){
                queue.pollFirst();
            }
            while(!queue.isEmpty() && arr[i]>=arr[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
            result.add(arr[queue.peekFirst()]);
        }
        return result;
    }
}
