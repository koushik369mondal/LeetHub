class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int currProd = 1;
            for(int j=i; j<n; j++){
                currProd *= nums[j];
                maxProd = Math.max(maxProd, currProd);
            }
        }
        return maxProd;
    }
}