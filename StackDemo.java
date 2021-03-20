package collection;

import java.util.Collections;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("a");
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		Collections.sort(s);
		System.out.println(s);
		System.out.println(s.search("A"));  // if element is there then return offSet else return -1
		System.out.println(s.search("Z"));
	}

}
