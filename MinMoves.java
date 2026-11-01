class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int num: nums){
            if(min > num){
                min = num;
            }
        }
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        int moves = sum - (nums.length * min);
        return moves;
    }
}