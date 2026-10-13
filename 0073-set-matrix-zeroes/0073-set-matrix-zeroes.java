class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // track to set 0
        boolean[] zeroRows = new boolean[n];
        boolean[] zeroCols = new boolean[m];

        // find x,y = 0
        for(int i=0; i<n; i++){
            for(int j=0 ; j<m; j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // make row and col 0
        for(int i=0; i<n; i++){
            for(int j=0 ; j<m; j++){
                if(zeroRows[i] || zeroCols[j]){
                   matrix[i][j] = 0; 
                }
            }
        }
    }
}