class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        dp[0] = nums[0];
        dp[1] = nums[1];
        for(int i = 1; i < nums.length; i++){
            int notPick = dp[i - 1];
            int pick = Integer.MIN_VALUE;
            if(i == 1){
                pick = nums[i];
            }
			else{
                pick = nums[i] + dp[i - 2];
            }

            dp[i] = Math.max(pick, notPick);
        }
        
        return dp[nums.length-1];
    }
}
