class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        
        for (int i = 0; i < mat.length; i++) {
            boolean knowsSomeone = false;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    knowsSomeone = true;
                    set.add(j);
                }
            }
            if (!knowsSomeone) {
                set.add(i);
            }
        }
        
        for (int num : set) {
            boolean isCelebrity = true;
            for (int j = 0; j < mat.length; j++) {
                if (j != num) {
                    if (mat[num][j] == 1 || mat[j][num] == 0) {
                        isCelebrity = false;
                        break;
                    }
                }
            }
            if (isCelebrity) {
                return num;
            }
        }
        return -1;
    }
}
