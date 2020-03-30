import java.util.Stack;

public class QueueUsingStack {

	  Stack<Integer> s1 = new Stack<Integer>();
	    Stack<Integer> s2 = new Stack<Integer>();
	    int front=0;
	
	public QueueUsingStack() {
		
	}
	
	public void push(int x) {
		System.out.println("Inside push");
		if(s1.isEmpty())
			front = x;
		while(!s1.isEmpty())
			s2.push(s1.pop());
		s2.push(x);
		while(!s2.isEmpty())
			s1.push(s2.pop());
		
	}
	public int pop() {
        int x = s1.pop();
        if(!s1.isEmpty())
            front = s1.peek();
       return x; 
    }
	
	public int peek() {
        return front;
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack obj = new QueueUsingStack();
		   obj.push(1);
		   obj.push(2);
		   obj.push(3);
		   obj.push(4);
		   System.out.println("top element of queue" +obj.peek());
		 obj.pop();
		 System.out.println("top element of queue" +obj.peek());
		 obj.pop();
		 System.out.println("top element of queue" +obj.peek());
		 obj.pop();
		 System.out.println("top element of queue" +obj.peek());
		
		 int param_3 = obj.peek();
		 System.out.println("top of queue" + param_3);
		 boolean param_4 = obj.empty();
		 //System.out.println("is the queue empty" + param_4);

	}

}
