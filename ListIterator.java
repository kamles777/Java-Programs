package collection;

import java.util.LinkedList;

public class ListIterator {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Poonam");
		ll.add("Mausam");
		ll.add("Pooja");
		ll.add("Ankita");
		System.out.println(ll);
		java.util.ListIterator<String> ltr=ll.listIterator();
		while (ltr.hasNext()) {
			String s=ltr.next();
			if(s.equals("Pooja")) {
				ltr.remove();
			}
			else if(s.equals("Poonam")) {
				
				ltr.add("Kavita");
			}
			else if(s.equals("Mausam"))
			{
				ltr.set("Moumita");
			}
			
		}
		
		System.out.println(ll);
	}

}
