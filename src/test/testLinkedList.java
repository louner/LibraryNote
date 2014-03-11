package test;
import java.util.LinkedList;

public class testLinkedList {

	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(1);
		ll.add(2);
		ll.addFirst(0);
		
		assert ll.getFirst() == 0;
		assert ll.getLast() == 2;
		
		ll.addLast(3);
		assert ll.getLast() == 3;
		
		assert ll.pop() == 0;
		assert ll.getFirst() == 1;
	}
}
