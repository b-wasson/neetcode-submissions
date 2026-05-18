class MinStack {
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();

        
    }
    
    public void push(int val) {
        Integer value = val;
        stack.add(value);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
    int min = Integer.MAX_VALUE;
    for(Integer num : stack){
        if(min > num){
            min = num;
        }
    }
       return min;
        
    }
}
