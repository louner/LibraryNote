package tools;
import java.util.LinkedList;

public class LimitedQueue<E> extends LinkedList<E> {

    private final int limit;

    public LimitedQueue(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean add(E o) {
        super.add(o);
        while (size() > limit) { super.remove(); }
        return true;
    }
    
    public static void main(String[] args)
    {
    	int size = 3;
    	LimitedQueue<Integer> Q = new LimitedQueue<Integer>(size);
    	
    	Q.add(1);
    	Q.add(2);
    	Q.add(3);
    	Q.add(4);
    	
    	assert Q.pop() == 2;
    	assert Q.element() == 3;
    }
}