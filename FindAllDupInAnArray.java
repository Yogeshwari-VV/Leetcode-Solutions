class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int cur = nums[i]-1;
            if(nums[i] != nums[cur]){
                swap(nums, i, cur);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1) res.add(nums[j]);
        }
        return res;
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}