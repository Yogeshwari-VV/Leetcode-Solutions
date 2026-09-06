class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for(int i=0;i<=heights.length;i++){
            int curHeight = (i==heights.length) ? 0:heights[i];
            while(!stack.isEmpty() && curHeight < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width;
                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i - stack.peek() - 1;
                }
            int area = height * width;
            max = Math.max(max, area);
            }
            stack.push(i);
        }
        return max;
    }
}