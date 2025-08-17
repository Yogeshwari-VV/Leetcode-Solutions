class Solution {
    public int countSegments(String s) {
        int count=0;
        String[] seg=s.split(" ");
        for(String word:seg){
            if(!word.isEmpty()){
            count++;
        }
        }
        return count;
        
    }
}