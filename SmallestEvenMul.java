class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0)   //(n&1==0)
            return n;
        else
            return n*2;
        
    }
}