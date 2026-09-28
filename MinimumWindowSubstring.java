class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        // Store frequency of characters in t
        for(char c:t.toCharArray()){
            freq[c-'A']++;
        }
        int left = 0, count = 0, start = 0, minLen = Integer.MAX_VALUE;
        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
            // Character is still required
            if(freq[c-'A'] > 0){
                count++;
            }
        // Character enters the window
        freq[c-'A']--;
          // Window contains all characters of t
        while(count == t.length()){
            if(right-left+1 < minLen){
                minLen = right-left+1;
                start = left;
            }
           // Remove left character
            char lc = s.charAt(left);
            freq[lc-'A']++;

           // Window is no longer valid
            if(freq[lc-'A'] > 0){
                count--;
            }
            left++;
        }
       }
       if(minLen == Integer.MAX_VALUE){
        return "";
       }
       return s.substring(start, start+minLen);

    }
}