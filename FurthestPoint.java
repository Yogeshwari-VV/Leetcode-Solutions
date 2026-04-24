class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0, countR = 0, count_ = 0;
        for(char c:moves.toCharArray()){
            if(c == 'L') countL++;
            else if(c == 'R') countR++;
            else count_++;
        }
        return Math.abs(countL-countR) + count_;
    }
}