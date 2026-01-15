class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
       int less = 0;
       int equal = 0;
       for(int num : nums){
        if(num<target) less++;
        else if(num==target) equal++;
       }
       List<Integer> res = new ArrayList<>();
       for(int i=0;i<equal;i++){
        res.add(less+i);
       }
       return res;
    }
}