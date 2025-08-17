class Solution {
    public String reverseWords(String s) {
        char[] c=s.toCharArray();
        int start=0;
        for(int end=0;end<=c.length;end++){
            if(end==c.length || c[end]==' '){
                reverse(c,start,end-1);
                start=end+1;
            }

            }
            return new String(c);
        }
        private void reverse(char c[],int left,int right){
        while(left<right){
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;

        }
        
    }
}