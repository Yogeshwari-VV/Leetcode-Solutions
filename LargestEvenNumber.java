1.Built-in 
class Solution {
    public String largestEven(String s) {
        int index = s.lastIndexOf('2');
        if(index == -1) return "";
        return s.substring(0, index+1);
    }
}
2.User-defined
class Solution {
    public String largestEven(String s) {
        int index = -1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='2'){
                index = i;
                break;
            }
        }
        if(index==-1) return "";
        return s.substring(0, index+1);
    }
}