class Solution {
    public String convertToBase7(int num) {
        if (num==0) return "0";
        boolean isNeg=num<0;
        num=Math.abs(num);
        StringBuilder result=new StringBuilder();
        while(num>0){
            int rem=num%7;
            result.append(rem);
            num/=7;
        }
        if(isNeg) result.append('-');
        return result.reverse().toString();
        
    }
}