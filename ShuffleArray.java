class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        int i=0,j=n,k=0;
        while(i<n){
            ans[k++]=nums[i++];
            ans[k++]=nums[j++];
        }
        return ans;
    }
}