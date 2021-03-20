
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String st=sc.nextLine();
		System.out.println("Enter second string");
		String st1=sc.nextLine();
		
	/*	String st="HItlEr WOman";
		String st1="MOTHER iN lAw";*/

		st=st.replace(" ", ""); // remove blank space as empty string
		st1=st1.replace(" ", "");
		
		st=st.toLowerCase(); // to remove case sensitive things
		st1=st1.toLowerCase();
		
		char a[]=st.toCharArray(); //stored into array
		char b[]=st1.toCharArray();
		
		Arrays.sort(a); // sort the arrays
		Arrays.sort(b);
		
		Boolean result=Arrays.equals(a, b);
		if(result==true)
		{
			System.out.println("Strings are anagram");
		}
		else
			System.out.println("not anagram");
	}

}
