package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>();
		l.add(4);
		l.add(14);
		l.add(34);
		l.add(null);
		l.add(24);
		l.add(11);
	System.out.println(l);
	
	l.remove();
	System.out.println(l);
	
	l.removeLast();
	System.out.println(l);
	
	l.addFirst(125);
	System.out.println(l);
	
	/*Collections.sort(l);
	System.out.println(l);    // null insertion is acceptable until sorting , as we applied sorting then NullPointerException
	Collections.reverse(l);
	System.out.println(l);*/
	
	}

}
