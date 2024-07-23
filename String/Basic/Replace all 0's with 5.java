class Solution {
    int convertfive(int num) {
        // Your code here
        String n= String.valueOf(num);
        n=n.replaceAll(String.valueOf('0'),String.valueOf('5'));
        num=Integer.valueOf(n);
        return num;
    }
}
