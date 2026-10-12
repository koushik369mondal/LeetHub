class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);
        int count = 1;

        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                count++;
            }else{
                if(count > n/3){
                    list.add(nums[i]);
                }
                count = 1;
            }
        }
        if(count > n/3){
            list.add(nums[n-1]);
        }
        return list;
    }
}