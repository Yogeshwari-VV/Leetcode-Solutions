class Solution {
    public String decodeString(String s) {
        Stack<Integer> numS=new Stack<>();
        Stack<String> strS=new Stack<>();
        int num=0;
        String cur="";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }else if(c=='['){
                numS.push(num);
                strS.push(cur);
                num=0;
                cur="";
            }else if(c==']'){
                int times=numS.pop();
                String prev=strS.pop();
                String temp="";
                for(int i=0;i<times;i++){
                    temp+=cur;
                }
                cur=prev+temp;
            }else{
                cur+=c;
            }
        }
        return cur;
    }
}