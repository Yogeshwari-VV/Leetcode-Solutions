class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i=0;i<32;i++){
            int bit  = n & 1;  // extract the last bit
            res = res << 1;  // make space for next bit 
            res = res | bit; // add extracted bit to res
            n = n >>> 1;  // shift original number to right at one position
        }
        return res;
    }
}