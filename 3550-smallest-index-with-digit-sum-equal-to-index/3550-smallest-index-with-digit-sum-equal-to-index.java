class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(digitSum(nums[i]) == i){
                return i;
            }
        }
        return -1;
    }
    public int digitSum(int x){
        int sum = 0;
        while(x > 0){
            int digit = x % 10;
            sum += digit;
            x /= 10;
        }
        return sum;
    }
}