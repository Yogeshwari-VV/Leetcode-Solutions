class Solution {
    public int numberOfSpecialChars(String word) {
       int lower = 0, upper = 0;
       for(char ch : word.toCharArray()){
        if(Character.isLowerCase(ch)){
            lower |= (1 << (ch-'a'));
        }else{
            upper |= (1 << (ch-'A'));
        }
       }
       int common = lower & upper;
       int count = 0;
       while(common > 0){
        count += common & 1;
        common >>=1;
       }
       return count;
    }
}