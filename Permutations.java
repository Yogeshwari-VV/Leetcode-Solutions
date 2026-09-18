class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>(), res);
        return res;
    }
    void backtrack(int[] nums, boolean[] used, List<Integer> cur, List<List<Integer>> res){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            //choose
            cur.add(nums[i]);
            used[i] = true;
            //explore
            backtrack(nums, used, cur, res);
            //undo
            cur.remove(cur.size()-1);
            used[i] = false;
        }
    }
}