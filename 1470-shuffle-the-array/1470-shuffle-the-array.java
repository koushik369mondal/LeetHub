class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int[nums.length];
        int i=0;
        int k=n;
        for(int j=0;j<arr.length;j+=2){
            arr[j] = nums[i];
            arr[j+1] = nums[k];
            i++;
            k++;
            
        }
        return arr;
        
    }
}