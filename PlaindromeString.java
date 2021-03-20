package collection;

import java.util.Scanner;

public class PlaindromeString {
	public static void main(String[] args) {
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String OriginalString=sc.nextLine();
		for (int i = OriginalString.length()-1; i >=0 ; i--) {
			
			reverse=reverse+OriginalString.charAt(i);
			
		}
		if (OriginalString.equals(reverse)) {
			System.out.println("String is palindrome");
			
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
