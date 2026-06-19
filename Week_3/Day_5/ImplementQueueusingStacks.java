class MyQueue {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> container=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
        
    }
    
    public int pop() {
        while(st.size()>1){
            container.push(st.pop());
        }
        int front=st.pop();
        while(container.size()>0){
            st.push(container.pop());
        }
        return front;
    }
    
    public int peek() {
        while(st.size()>1){
            container.push(st.pop());
        }
        int front=st.peek();
        while(container.size()>0){
             st.push(container.pop());
        }
        return front;
        
    }
    
    public boolean empty() {
        return (st.size()==0);
    }
}
