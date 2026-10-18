class Solution {
    public int mostFrequentEven(int[] nums) {
        int maxFreq = 0;
        int ans = -1;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] % 2 == 0){
                int count = 0;
                for(int j=0; j<n; j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
                if(count > maxFreq || (count == maxFreq && nums[i] < ans)){
                    maxFreq = count;
                    ans = nums[i];
                }
            }
        }
        return ans;
    }
}