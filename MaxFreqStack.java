class FreqStack {
    HashMap<Integer, Integer> freq;
    HashMap<Integer, Stack<Integer>> group;
    int max;

    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();  
        max = 0;     
    }
    
    public void push(int val) {
        int f = freq.getOrDefault(val,0)+1;
        freq.put(val,f);
        group.computeIfAbsent(f, k -> new Stack<>()).push(val);
        max = Math.max(max, f);
    }
    
    public int pop() {
        Stack<Integer> stack = group.get(max);
        int val = stack.pop();
        freq.put(val, freq.get(val)-1);
        if(stack.isEmpty()){
            max--;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */