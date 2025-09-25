class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        char[] res = new char[s.length()];
        int ind=0;
        int count=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(count>0){
                res[ind++]=ch;
            }
            count++;
            }
            else{
                count--;
                if(count>0){
                    res[ind++]=ch;
                }
            }
        }
        return new String(res,0,ind);

    }
}