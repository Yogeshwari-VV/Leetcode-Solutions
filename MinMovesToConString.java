class Solution {
    public int minimumMoves(String s) {
        int moves=0;
        for(int i=0;i<s.length();){
            if(s.charAt(i)=='X'){
            moves++;
            i+=3;
        }else{
            i++;
        }
        }
        return moves;
        
    }
}