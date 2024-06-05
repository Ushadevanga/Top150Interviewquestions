class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        
            int ans = nums[0];
            while(ans>0){
                int i=0;
                i = i+nums[i];
                if(nums[i]==0){
                    return false;
                }
                if(nums[i]>=nums[nums.length-1]){
                    return true;
                }
                ans--;
            }
        
        return false;
    }
}
