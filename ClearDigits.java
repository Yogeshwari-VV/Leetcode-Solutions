class Solution {
    public String clearDigits(String s) {
        char[] c = s.toCharArray();
        char[] stack = new char[c.length];
        int top=0;
        for(int i=0;i<c.length;i++){
            if(!(c[i]>='0' && c[i]<='9')){
                stack[top++]=c[i];
            }else{
                top--;
            }
        }
        return new String(stack,0,top);
        
    }
}