class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int OneD = accounts.length;
        for(int i=0; i<OneD; i++){
            int TwoD = accounts[i].length;
            for(int j=1; j<TwoD; j++){
                accounts[i][0] += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, accounts[i][0]);
        }
        return maxWealth;
    }
}