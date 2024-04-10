class Solution{
    static int findSingle(int n, int arr[]){
        // code here
        HashSet<Integer> set =new HashSet<>();
        for(int num:arr){
            if(set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }
        for(int num:set)
            return num;
        return -1;
    }
}
