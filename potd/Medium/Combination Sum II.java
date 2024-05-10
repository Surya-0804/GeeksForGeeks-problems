class Solution {
    public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
        // Code Here.
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(arr);
        
        findCombination(0,arr,k,answer,new ArrayList<>());
        return answer;
    }
    
    private static void findCombination(int index , int[] arr , int target , List<List<Integer>> answer , List<Integer> ds){
        
        if(target==0){
            answer.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=index ; i<arr.length ; i++){
            if(i>index && arr[i]==arr[i-1])
                continue;
            if(arr[i]>target)
                break;
                
            ds.add(arr[i]);
            findCombination(i+1 , arr , target-arr[i] , answer , ds);
            ds.remove(ds.size()-1);
        }
    }
}
