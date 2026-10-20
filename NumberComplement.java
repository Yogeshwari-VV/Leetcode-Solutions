class Solution {
    public int findComplement(int num) {
       int count = 0;
       int temp = num;
       while(temp>0){
        temp = temp >> 1;
        count++;
       }
       int mask = (1 << count) - 1;
       int ans = (~num) & mask;
       return ans;
    }
}