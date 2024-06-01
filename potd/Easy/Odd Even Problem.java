class Solution {
    public static String oddEven(String s) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int x=0; 
        int y=0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getKey()%2==0 && entry.getValue()%2==0){
                x++;
            }
            else if(entry.getKey()%2==1 && entry.getValue()%2==1){
                y++;
            }
        }
        return (x+y)%2 == 0? "EVEN" : "ODD";
    }
}
