class Solution {
    public int vowelConsonantScore(String s) {
        int vow = 0, cons = 0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow++;
            }else if(Character.isLetter(ch)){
                cons++;
            }
        }
        if(cons>0)
          return (int)Math.floor(vow/cons);
        else
           return 0;
    }
}