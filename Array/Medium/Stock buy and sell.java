class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
        
        for(int i=1; i<n ; i++){
            if(A[i]>A[i-1]){
                ArrayList<Integer> arr=new ArrayList<>();
                arr.add(i-1);
                while(i<n && A[i]>A[i-1]){
                    i++;
                }
                arr.add(i-1);
                answer.add(arr);
            }
        }
        return answer;
    }
}
