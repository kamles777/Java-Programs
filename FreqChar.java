/*package collection.NumConversation;

import java.util.Scanner;

public class FreqChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		st=st.toLowerCase();
		System.out.println("Character\tFrequency");  //heading
		for (char ch = 'a'; ch < 'z'; ch++) {

			int count=0;   // counter variable to count frequency of character
			for (int i = 0; i < st.length(); i++) {
				if(ch==st.charAt(i))  // checking string character from alphabet letters
					count++;

			}
			if (count!=0) {
				System.out.println(ch + "   -->\t\t" + count);   // tab to give space

			}

		}
	}

}*/



/*import java.util.Hashtable; 
    class hashtable { 
        public static void main(String args[]) { 
            Hashtable obj = new Hashtable(); 
            obj.put("A", new Integer(3)); 
            obj.put("B", new Integer(2)); 
            obj.put("C", new Integer(8)); 
            obj.remove(new String("A")); 
            System.out.print(obj); 
        } }*/

class Aaa{
   public static void main(String args[]) { 
        String s1 = "JAVA"; 
        String s2 = new String("java"); 
        if(s1 == s2) 
            System.out.println("One"); 
        else if(s1.equals(s2)) 
        	System.out.println("{TWO"); 
        else if(s2.equalsIgnoreCase(s1)) 
        	System.out.println("Three"); 
 
    } 
}

