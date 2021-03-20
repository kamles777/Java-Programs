package collection.NumConversation;

import java.util.Scanner;

public class ASCIIvalue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.nextLine().charAt(0);
		int asc=(int)ch;
		System.out.println("ASCII value for "+ ch+"="+asc);
		String bin="";
		while (asc>0) {
			int rem=asc%2;
			asc/=2;
			bin=rem+bin;



		}
	
		System.out.println("Binary Equivalent for "+ch+"="+bin);
	}

}
