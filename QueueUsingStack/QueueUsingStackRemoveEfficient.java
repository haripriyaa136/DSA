import java.util.Stack;
class QueueUsingStackRemoveEfficient {
    private Stack<Integer> first;
    private Stack<Integer> helper;
    public QueueUsingStackRemoveEfficient() {
        first= new Stack<>();
        helper=new Stack<>();
    }
    public void push(int x) {
        int initialSize =first.size();
        for(int i=0;i<initialSize;i++){
            helper.push(first.pop());
        }
        first.push(x);
        for(int i=0;i<initialSize;i++){
            first.push(helper.pop());
        }
        System.out.println("Stack After pushing "+x+" "+first);
    }
    public int pop() {
        int popValue = first.pop();
        System.out.println("popped Value"+popValue);
       return popValue;
    }
    public int peek() {
        int peekValue = first.peek();
        System.out.println("peek Value"+peekValue);
        return first.peek();
    }
    public boolean empty() {
        return first.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */