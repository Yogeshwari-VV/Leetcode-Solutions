class Solution {
    public int possibleStringCount(String word) {
        int n=word.length();
        int total=1;
        int i=0;

        while(i<n){
            int j=i;
            while(j<n && word.charAt(i)==word.charAt(j)){
                j++;

            }
            int grpLen=j-i;
            if(grpLen>=2){
                total+=(grpLen-1);
            }
            i=j;
        }
        return total;
        
    }
}