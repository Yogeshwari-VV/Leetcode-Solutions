class Solution {
    public int secondHighest(String s) {
       int firstMax=-1;
       int secMax=-1;
       for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(c>='0' && c<='9'){
            int digits=c-'0';
            if(digits>firstMax){
                secMax=firstMax;
                firstMax=digits;
            }else if(digits<firstMax && digits>secMax){
                secMax=digits;
        
            }
        }
       }
       return secMax;
    }
}
