package collection.NumConversation;

import java.util.Scanner;

public class BinToDec {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the binary number");
		int x=sc.nextInt();
		int temp=x,dec = 0,i=0;
		
		while (temp>0) {
			
			int rem=temp%10;
			temp=temp/10;
			dec= (int) (dec+rem*Math.pow(2, i++));
			
		}
		System.out.println(dec);
		
	}

}
