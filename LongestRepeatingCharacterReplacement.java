class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxFreq = 0, maxLen = 0; 
        for(int right =0;right <s.length();right++){
            freq[s.charAt(right)-'A']++;  //add
            maxFreq = Math.max(maxFreq,  freq[s.charAt(right)-'A']);
            int windowLen = right - left + 1;
            int replacement = windowLen - maxFreq;  //replacemnt
            while(replacement>k){
                 freq[s.charAt(left)-'A']--;  //remove
                 left++;
                 windowLen = right - left + 1;
                 replacement = windowLen - maxFreq;
                 
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}