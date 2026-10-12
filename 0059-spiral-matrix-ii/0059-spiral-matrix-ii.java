class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;

        int SR=0;
        int SC=0;
        int ER=n-1;
        int EC=n-1;

        while(SR<=ER && SC<=EC){
            // top
            for(int j=SC; j<=EC; j++){
                matrix[SR][j] = num++;
            }

            // right
            for(int i=SR+1; i<=ER; i++){
                matrix[i][EC] = num++;
            }

            // bottom
            if(SR < ER){
                for(int j=EC-1; j>=SC; j--){
                    matrix[ER][j] = num++;
                }
            }

            // left
            if(SC < EC){
                for(int i=EC-1; i>=SR+1; i--){
                    matrix[i][SC]= num++;
                }
            }
            SR++;
            SC++;
            ER--;
            EC--;
        }
        return matrix;
    }
}