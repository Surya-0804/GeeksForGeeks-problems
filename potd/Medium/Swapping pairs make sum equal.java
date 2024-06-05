class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        // Your code goes here
        HashSet<Long> set=new HashSet<>();
        long aSum=0,bSum=0;
        for(long num : a){
            aSum+=num;
        }
        
        for(long num : b){
            bSum+=num;
        }
        long difference=Math.abs(aSum-bSum);
        if(difference ==0){
            return 1;
        }
        if((aSum+bSum)%2 == 1){
            return -1;
        }
        
        for(long num : a){
            set.add(num);
        }
        
        for(long num : b){
            if(set.contains(difference - num))
                return 1;
        }
        return -1;
    }
}
