class Solution {
    /*You are required to complete this method*/
    boolean isToeplitz(int mat[][]) {
        // Your code here
        int row=mat.length;
        int col=mat[0].length;
        
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if( (i+1 <row) &&(j+1 <col)){
                    if(mat[i][j]!=mat[i+1][j+1])
                        return false;
                }
            }
        }
        return true;
    }
}
