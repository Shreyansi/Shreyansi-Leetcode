import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
	Queue<Integer> queue = new LinkedList<>();
	
	public StackUsingQueue() {
		
	}
	
	public void push(int x) {
		queue.add(x);
		for(int i= 1;i<queue.size();i++)
			queue.add(queue.poll());
	}
	
	public int pop() {
		return queue.poll();
	}
	 public int top() {
		 return queue.peek();
	 }
	 
	 public boolean empty() {
	        return queue.isEmpty();
	    }
	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		 StackUsingQueue obj = new StackUsingQueue();
			   obj.push(1);
			   obj.push(2);
			   obj.push(3);
			   obj.push(4);
			 System.out.println("top element of stack" +obj.top());
			 obj.pop();
			 System.out.println("top element of stack" +obj.top());
			 obj.pop();
			 System.out.println("top element of stack" +obj.top());
			 obj.pop();
			 System.out.println("top element of stack" +obj.top());
			
			 int param_3 = obj.top();
			 System.out.println("top of queue" + param_3);
			 boolean param_4 = obj.empty();
			 //System.out.println("is the queue empty" + param_4);

		}

}
