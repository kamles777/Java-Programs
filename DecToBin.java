package collection.NumConversation;

import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int x=sc.nextInt();
		
		int temp= x;
		String st="";
		while (temp>0) {
			
		int	rem=temp%2;
			temp=temp/2;
			st=rem+st;
		}
		System.out.println(st);
	}

}
