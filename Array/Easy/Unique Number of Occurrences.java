class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int num :map.values()){
            if(!set.add(num))
                return false;
        }
        return true;
    }
}
