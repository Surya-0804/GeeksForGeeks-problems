class Solution {
    public int findCoverage(int[][] matrix) {
        // code here
        int count=0;
        int[] X={0,0,-1,1};
        int[] Y={-1,1,0,0};
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    for(int k=0; k<4; k++){
                        int newX=i+X[k];
                        int newY=j+Y[k];
                        if(newX >=0 && newX<matrix.length && newY >=0 && newY<matrix[0].length && matrix[newX][newY]==1 )
                            count++;
                    }
                }
            }
        }
        return count;
    }
}
