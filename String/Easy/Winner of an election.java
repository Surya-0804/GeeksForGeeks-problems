class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String,Integer> map=new HashMap<>();
        for(String str:arr){
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }
            else{
                map.put(str,1);
            }
        }
        int max=-1;
        String winner="";
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String person=entry.getKey();
            int val=entry.getValue();
            if(max<val){
                max=val;
                winner=person;
            }
            else if(val==max && person.compareTo(winner)<0){
                winner=person;
            }
        }
        String[] result={winner,String.valueOf(max)};
        return result;
    }
}
