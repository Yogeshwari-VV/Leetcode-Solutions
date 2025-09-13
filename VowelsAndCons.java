class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int maxVowel=0;
        int maxCon=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        }

        for(int i=0;i<26;i++){
            int count=freq[i];
            if(count>0){
                char c =(char)(i+'a');
                if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'){
                    if(count>maxVowel){
                        maxVowel=count;
                    }
                }else{
                    if(count>maxCon){
                        maxCon=count;
                    }
                }
            }
        }

        return maxVowel+maxCon;
        
    }
}