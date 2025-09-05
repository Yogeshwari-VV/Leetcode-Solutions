class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        if(nums[0]==0) return false;
        boolean[] dp = new boolean[nums.length];
        Arrays.fill(dp,false);
        dp[0]=true;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && j+nums[j]>=i){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[nums.length-1];
    }
}