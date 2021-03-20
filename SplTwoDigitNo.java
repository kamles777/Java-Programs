package collection.NumConversation;

import java.util.Scanner;

public class SplTwoDigitNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no you want to check");
		int n=sc.nextInt();
		if (n>9&&n<100) {

			int d1=n%10;
			int d2=n/10;

			int sum=(d1+d2)+(d1*d2);
			if (n==sum) {
				System.out.println("number is special two digit number");

			}
			else
				System.out.println("not special number");

		}
		else
			System.out.println("number is not two digit number");

	}

}
