class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i : arr){
            int sum=k-i;
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return count;
    }
}
