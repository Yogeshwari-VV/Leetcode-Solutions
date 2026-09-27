class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freqP = new int[26];
        int[] freqS = new int[26];
        int left = 0;
        List<Integer> res = new ArrayList<>();
        //Frequency of p
        for(int i=0;i<p.length();i++){
            freqP[p.charAt(i)-'a']++;
        }
        //Frequency of s
        for(int right = 0; right<s.length();right++){
            freqS[s.charAt(right)-'a']++;
            //windowSize equals to p length
            if((right-left+1) == p.length()){
                //both freq are equals
                if(Arrays.equals(freqP, freqS)){
                    //add index
                    res.add(left);
                }
                //otherwise remove left and increase
                freqS[s.charAt(left)-'a']--;
                left++;
            }
        }
        return res;
    }
}