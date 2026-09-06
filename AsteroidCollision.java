class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid:asteroids){
            boolean alive = true;
            while(alive && !stack.isEmpty() && stack.peek()>0 && asteroid < 0){
                if(stack.peek() < -asteroid){
                    stack.pop();
                }else if(stack.peek()==-asteroid){
                    stack.pop();
                    alive = false;
                }else{
                    alive = false;
                }
            }
                if(alive){
                    stack.push(asteroid);
                }
        }
        int[] arr = new int[stack.size()];
        for(int i=0;i<stack.size();i++)
            arr[i] = stack.get(i);
        }
        return arr;
    }
}