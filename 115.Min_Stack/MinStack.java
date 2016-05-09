public class MinStack {


    /** initialize your data structure here. */
    Stack<Integer> st;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        if (x <= min){
            st.push(min);
            min = x;
        }
        st.push(x);
    }
    
    public void pop() {
        if (st.peek()==min){
            st.pop();
            min = st.pop();
        }else{
            st.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
