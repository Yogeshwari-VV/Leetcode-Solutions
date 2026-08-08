class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int count = 0;
        for(int num:set){
            if(!set.contains(num-1)){
                int j = num;
                int curCount = 0;
                while(set.contains(j)){
                    j++;
                    curCount++;
                }
                count = Math.max(count, curCount);
            }
        }
        return count;
    }
}