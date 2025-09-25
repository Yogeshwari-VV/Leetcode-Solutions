class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        boolean[] broken = new boolean[26];

        for(int i=0;i<brokenLetters.length();i++){
            broken[brokenLetters.charAt(i)-'a']=true;
        }
        int count=0;
        for(String word : words){
            boolean canType=true;
            for(int i=0;i<word.length();i++){
                if(broken[word.charAt(i)-'a']){
                    canType=false;
                    break;
                }
            }
            if (canType) count++;
        }
        return count;
    }
}