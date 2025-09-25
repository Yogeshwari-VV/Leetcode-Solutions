class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxFreq=0;
        for(int f:map.values()){
            maxFreq=Math.max(maxFreq,f);
        }
        int count=0;
        for(int f:map.values()){
            if(f==maxFreq){
                count+=f;;
            }
        }
        return count;
    }
}