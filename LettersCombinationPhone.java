class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.isEmpty()) return res;
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        generate(res, digits, "", map);
        return res;
    }
    private void generate(List<String> res, String digits, String s, String[] map){
        if(s.length()==digits.length()){
            res.add(s);
            return;
        }
        String letters = map[digits.charAt(s.length())-'0'];
        for(char c:letters.toCharArray()){
            generate(res, digits, s+c, map);
        }
    }
}