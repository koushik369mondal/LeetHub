class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int[nums.length];
        int i=0;
        for(int j=0;j<arr.length;j+=2){
            arr[j] = nums[i];
            i++;
            
        }
        i=n;
        for(int j=1;j<arr.length;j+=2){
            arr[j] = nums[i];
            i++;
            
        }
        return arr;
        
    }
}