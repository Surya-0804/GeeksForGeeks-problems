class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int num : arr){
            if(set.contains(num-x) || set.contains(x+num) )
                return 1;
            set.add(num);
        }
        return -1;
    }
}
