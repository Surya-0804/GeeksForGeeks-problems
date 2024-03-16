

class Solution {
    String removeDuplicates(String str) {
        HashSet<Character> h=new HashSet<>();
        StringBuilder strNew=new StringBuilder();
        for(int i=0; i<str.length();i++){
            if(!h.contains(str.charAt(i))){
                strNew.append(str.charAt(i));
                h.add(str.charAt(i));
            }
        }
        return strNew.toString();
    }
}

