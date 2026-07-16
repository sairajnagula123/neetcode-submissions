class Solution {
    public boolean canJump(int[] nums) {
        int maxJump = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>maxJump){
                return false;
            }
            maxJump =Math.max(i + nums[i],maxJump);
        }
        return true;
    }
}
