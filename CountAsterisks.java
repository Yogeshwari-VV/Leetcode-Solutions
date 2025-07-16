class Solution {
    public int countAsterisks(String s) {
        int count=0;
        boolean insideBar=false;

        for(char ch:s.toCharArray()){
            if(ch=='|'){
                insideBar=!insideBar;
            }else if(ch=='*' && !insideBar){
                count++;
            }
        }
        return count;
        
    }
}