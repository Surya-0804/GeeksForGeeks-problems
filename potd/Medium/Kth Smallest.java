class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        for(int num :arr){
            queue.add(num);
            if(queue.size()>k)
                queue.poll();
        }
        return queue.poll();
    }
}
