class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        int[][] answer=new int[mat.length][mat[0].length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                answer[i][j]=mat[i][(j+k)%mat[i].length];
            }
        }
        return answer;
    }
}
