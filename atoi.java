class Solution {
    public int myAtoi(String s) {
        int i = 0, res = 0, sign = 1;
        if(s.length()==0) return 0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign = (s.charAt(i++)=='-') ? -1:1;
        }
        while(i<s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9')){
            int digit = s.charAt(i)-'0';
            if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && digit>7)){
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + digit;
            i++;
        }
        return res*sign;
    }
}