import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class MinStack {
	
	
	Deque<Integer> dq ;
    PriorityQueue<Integer> pq;

    /** initialize your data structure here. */
    public MinStack() {
        dq = new ArrayDeque<Integer>();
        pq = new PriorityQueue<Integer>();
        
    }
    
    public void push(int x) {
        dq.push(x);
        pq.offer(x);
    }
    
    public void pop() {
        int x = dq.pop();
        pq.remove(x);
    }
    
    public int top() {
        return dq.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack obj = new MinStack();
		 obj.push(2);
		 obj.push(1);
		 obj.push(8);
		 obj.push(4);
		 obj.push(5);
		 //int param_2 = obj.pop();
		 //System.out.println("Element popped from stack "+param_2);
		 int param_3 = obj.top();
		 int param_4 = obj.getMin();
		
		System.out.println("Top of stack "+param_3);
		System.out.println("Minimum of stack "+param_4);

	}

}
