package collection;

import java.util.Scanner;

public class RevString {
	public static void main(String[] args) {
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string that you want to reverse");
		String str=sc.nextLine();
		for (int i = str.length()-1; i >=0 ; i--) {
			reverse=reverse+str.charAt(i);
			
			
		}
		System.out.println(reverse);
	}

}
