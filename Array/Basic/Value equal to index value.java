class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        ArrayList<Integer> answer=new ArrayList<>();
        for(int i=0; i<nums.size(); i++){
            if(i+1 == nums.get(i)){
                answer.add(i+1);
            }
        }
        return answer;
    }
}
