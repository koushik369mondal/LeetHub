class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int SR = 0;
        int SC = 0;
        int ER = matrix.length -1;
        int EC = matrix[0].length -1;

        while(SR <= ER && SC <= EC){
            // top
            for(int j=SC; j <= EC; j++){
                result.add(matrix[SR][j]);
            }

            // right
            for(int i=SR+1; i<=ER; i++){
                result.add(matrix[i][EC]);
            }

            // bottom
            if(SR < ER){
                for(int j=EC-1; j>=SC; j--){
                    result.add(matrix[ER][j]);
                }
            }

            // left
            if(SC < EC){
                for(int i=ER-1; i>= SR+1; i--){
                    result.add(matrix[i][SC]);
                }
            }
            SR++;
            SC++;
            ER--;
            EC--;
        }
        return result;
    }
}