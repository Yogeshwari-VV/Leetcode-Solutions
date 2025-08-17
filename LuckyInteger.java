class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res=-1;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int number=entry.getKey();
            int freq=entry.getValue();
            if(number==freq){
                res=Math.max(res,number);
            }
        }
        return res;
        
    }
}