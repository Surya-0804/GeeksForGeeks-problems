class Solution {
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        // code here
        ArrayList<Integer> answer=new ArrayList<>();
        int xor=0;
        for(int i=q-1 ; i>=0; i--){
            if(queries[i][0]==1){
                xor^=queries[i][1];
            }
            else{
                answer.add(queries[i][1]^xor);
            }
        }
        answer.add(xor);
        Collections.sort(answer);
        return answer;
    }
}
