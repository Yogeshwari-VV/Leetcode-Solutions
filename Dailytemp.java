class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         int n = temperatures.length;
         int[] res = new int[n];
         int[] stack = new int[n];
         int top=-1;
         for(int i=0;i<n;i++){
            while(top>=0 && temperatures[i]>temperatures[stack[top]]){
                int idx = stack[top--];
                res[idx]=i-idx;

            }
            stack[++top]=i;
         }
         return res;
        
    }
}