import java.util.ArrayList;
import java.util.List;

public class QueueImpl {

	 private List<Integer> data;         
	    // a pointer to indicate the start position
	    private int p_start;
	
	public QueueImpl() {
		data = new ArrayList<Integer>();
		p_start = 0;
	}
	
	public boolean enQueue(int x) {
		data.add(x);
		return true;
	}
	
	public boolean deQueue() {
		if(isEmpty())
			return false;
		else {
			p_start++;
			return true;
		}
	}
	public int Front() {
		return data.get(p_start);
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return data.size()==0;
	}
	
	public boolean isFull() {
		// TODO Auto-generated method stub
		return p_start>=data.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImpl q = new QueueImpl();
		q.enQueue(2);
		q.enQueue(4);
		q.enQueue(1);
		q.enQueue(8);
		
		if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }

	}

}
