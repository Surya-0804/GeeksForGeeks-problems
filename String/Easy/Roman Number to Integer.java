class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int result=map.get(str.charAt(0));
        for(int i=1;i<str.length() ; i++){
            if(map.get(str.charAt(i)) > map.get(str.charAt(i-1))){
                result+=map.get(str.charAt(i))-2*map.get(str.charAt(i-1));
            }
            else{
                result+=map.get(str.charAt(i));
            }
        }
        
        return result;
    }
}
