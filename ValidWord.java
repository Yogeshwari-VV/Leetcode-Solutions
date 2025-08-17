class Solution {
    public boolean isValid(String word) {
        if(word==null || word.length()<3) return false;
        int vowels=0;
        int consonants=0;
        for(char ch:word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)) return false;
        
        if(Character.isLetter(ch)){
            char lowerch=Character.toLowerCase(ch);
            if("aeiou".indexOf(lowerch)>=0){
                vowels++;
            }else{
                consonants++;
            }
        }
    }
        return vowels>0 && consonants>0;
        
    }
}