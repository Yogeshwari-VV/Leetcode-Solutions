class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }
    void backtrack(int[] nums, int start, List<Integer> cur, List<List<Integer>> res){
        res.add(new ArrayList<>(cur));
        for(int i=start;i<nums.length;i++){
            //choose
            cur.add(nums[i]);
            //explore
            backtrack(nums, i+1, cur, res);
            //undo
            cur.remove(cur.size()-1);
        }
    }
}