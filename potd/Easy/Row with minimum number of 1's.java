// User function Template for Java

class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int count=m;
        int result=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int b: a[i])
                c+=b;
            if(c<count){
                count=c;
                result=i;
            }
        }
        return ++result;
    }
}
