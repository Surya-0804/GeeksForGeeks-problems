class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<patt.length();i++){
            map.put(patt.charAt(i),i);
        }
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
