class Solution {
    public static int countNumberswith4(int n) {
        // code here
        if(n<4)
            return 0;
        if(n<14)
            return 1;
        int count=0;
        for(int i=1; i<=n; i++){
            if(contains(i))
                count++;
        }
        return count;
    }
    private static boolean contains(int n){
        while(n >0){
            if(n%10 == 4)
                return true;
            n/=10;
        }
        return false;
    }
}
