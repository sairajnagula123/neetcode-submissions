class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        
        for(int num : nums){
            sum = sum + num;
        }
        int rightSum = sum;

        for(int i=0;i<nums.length;i++){
            rightSum = sum -leftSum-nums[i];

            if(leftSum == rightSum){
                return i;
            }

            leftSum = leftSum + nums[i];
        }
        return -1;
        
    }
}