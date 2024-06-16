class Solution {
    private static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        
        for(int i=2; i<=n/2; i++){
            if(isPrime(i) && isPrime(n-i)){
                arr.add(i);
                arr.add(n-i);
                break;
            }
        }
        if(arr.isEmpty()){
            arr.add(-1);
            arr.add(-1);
        }
        return arr;
    }
}
