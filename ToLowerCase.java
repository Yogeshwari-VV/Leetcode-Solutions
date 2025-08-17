class Solution {
    public String toLowerCase(String s) {
        String res="";
        for(char c:s.toCharArray()){
            if(c>='A'&&c<='Z'){
                c=(char)(c+32);
            }
            res+=c;
        }
        return res;
        
    }
}