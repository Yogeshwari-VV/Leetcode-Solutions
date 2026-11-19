class Solution {
    public int maximumWealth(int[][] accounts) {
        int  max = 0;
        for(int[] account: accounts){
            int wealth = 0;
            for(int i=0;i<account.length;i++){
                wealth += account[i];
            }
            max = Math.max(max, wealth);
        }
        return max;
    }
}