class Solution{
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Your code here
        ArrayList<Integer> answer=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int num : v1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : v2){
            if(map.containsKey(num) && map.get(num) > 0) {
                answer.add(num); 
                map.put(num, map.get(num) - 1); 
            }
        }
        Collections.sort(answer);
        return answer;
    }
}
