class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int left = 0;
         // Frequency of s1
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
         // Frequency of s2
        for(int right = 0;right < s2.length();right++){
            // Add character entering window
            freq2[s2.charAt(right)-'a']++;
             // When window size becomes s1 length
            if((right-left+1) == s1.length()){
                // Compare entire frequency arrays
                if(Arrays.equals(freq1,freq2)){
                    return true;
                }

                // Remove character leaving window
                freq2[s2.charAt(left)-'a']--;
                left++;
            }
        }
        return false;
    }
}