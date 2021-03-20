package collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("A");
		hs.add("C");

		hs.add("B");

		hs.add("Z");
		hs.add(null);

		System.out.println(hs);
		System.out.println(hs.add("Z"));  //duplicate is not allowed
	}

}
