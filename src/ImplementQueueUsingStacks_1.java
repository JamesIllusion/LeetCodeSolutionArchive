class MyQueue {
    
    Stack<Integer> bottom = new Stack();
    Stack<Integer> top = new Stack();

    public void push(int x) {
        bottom.push(x);
    }

    public void pop() {
        peek();
        top.pop();
    }

    public int peek() {
        if (top.empty())
            while (!bottom.empty())
                top.push(bottom.pop());
        return top.peek();
    }

    public boolean empty() {
        return bottom.empty() && top.empty();
    }
}

/*
	Two stacks solution. Once stack to receive input element, the other one to push out. Only when the outgoing 
	stack is empty, will the elements from input stack pop to outgoing stack.
*/