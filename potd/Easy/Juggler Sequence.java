class Solution {
    static List<Long> jugglerSequence(long n) {
        // code here
        List<Long> answer=new ArrayList<>();
        sequence(n,answer);
        return answer;
    }
    private static void sequence(long n , List<Long> answer){
        if(n==1){
            answer.add(n);
            return;
        }
        answer.add(n);
        if(n%2==0){
            sequence((long)Math.pow(n,0.5),answer);
        }
        else{
            sequence((long)Math.pow(n,1.5),answer);
        }
    }
}
